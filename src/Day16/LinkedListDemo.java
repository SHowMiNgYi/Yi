package Day16;

/*
 *  链表
 *  LinkedList:没有默认的初始容量，不需要扩容
 *  特点:增删快，查询慢，线程不安全
 * */
public class LinkedListDemo {
    public static void main(String[] args) {
    }
}

class LinkedListTest {
    private int size = 0;
    //头尾节点
    private Node first;
    private Node last;

    public LinkedListTest() {

    }

    //私有内部类
    private class Node {
        //节点数据
        String data;
        Node prev;
        Node next;


        //构造方法
        public Node(String data, Node prev, Node next) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    //添加元素
    public void add(String str) {
        //创建一个节点
        Node node = new Node(str, null, null);
        //链表没有元素
        if (size == 0) {
            this.first = node;
        } else {
            //有元素
            this.last.next = node;
            node.prev = this.last;
        }
        this.last = node;
        size++;
    }

    //**一个一个找
    public Node getNode(int index) {
        Node no = first;
        for (int i = 0; i < index; i++) {
            no = no.next;
        }
        return no;
    }

    //**越界判断方法
    public void out(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("越界");
        }
    }

    //插入元素
    public void add(int index, String str) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        //插尾部
        if (index == size) {
            add(str);
            return;
        }
        //创建一个节点
        Node node = new Node(str, null, null);
        //插头部
        if (index == 0) {
            node.next = this.first;
            this.first.prev = node;
            this.first = node;
        }
        //插中间
        else {
            //一个一个找,找index索引处的节点
            Node no = first;
            for (int i = 0; i < index; i++) {
                no = no.next;
            }
            //*******插入的索引的节点的上一个节点的next属性
            //应该指向插入的节点,以线操作
            //1     插   2
            no.prev.next = node;
            node.prev = no.prev;
            node.next = no;
            no.prev = node;
        }
        size++;
    }

    //删除元素
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        //删头
        if (index == 0) {
            //设置新的头结点
            this.first = this.first.next;
            this.first.prev = null;
        }
        //删尾
        else if (index == (size - 1)) {
            this.last = this.last.prev;
            this.last.next = null;
        }
        //删中间
        else {
            Node no = first;
            for (int i = 0; i < index; i++) {
                no = no.next;
            }
            //1后
            no.prev.next = no.next;
            //3前
            no.next.prev = no.prev;
        }
        size--;
    }

    //删除指定的字符串
    public void remove(String str) {
        //首次出现的索引
        int i = indexOf(str);
        //找到字符串=1
        if (i != -1) {
            remove(i);
        }
    }

    //***寻找指定字符串首次出现的索引
    public int indexOf(String str) {
        //获取头结点
        Node no = this.first;
        for (int i = 0; i < size; i++) {
            //判断结点的字符串是否和指定字符串str相同
            //null==null   no.data == str
            if (no.data == str || no.data != null && no.data.equals(str)) {
                return i;
            }
            //往下走
            no = no.next;
        }
        return -1;
    }

    //清空
    public void clear() {
        this.first = this.last = null;
        size = 0;
    }

    //查看链表中是否包含对应的字符串
    public boolean contains(String str) {
        return indexOf(str) != -1;
    }

    //获取索引对应的字符串
    public String get(int index) {
        this.out(index);
        return getNode(index).data;
    }
    //修改索引处的内容

    public void set(int index, String str) {
        this.out(index);
        getNode(index).data = str;
    }

    //是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //实际长度
    public int size() {
        return size;
    }

    //截取子列表
    public LinkedListTest subList(int formIndex, int toIndex) {
        //越界判断
        this.out(formIndex);
        this.out(toIndex);
        if (formIndex > toIndex) {
            throw new IllegalArgumentException("参数不合法");
        }
        //创建子列表,长度指定toIndex - formIndex
        LinkedListTest llt = new LinkedListTest();
        //获取formIndex处的结点
        Node no = getNode(formIndex);
        for (int i = formIndex; i < toIndex; i++) {
            llt.add(no.data);
            no = no.next;
        }
        return llt;
    }

    //重写toString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node no = this.first;
        for (int i = 0; i < size; i++) {
            if (i == (size - 1)) {
                sb.append(no.data);
            } else {
                sb.append(no.data).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}