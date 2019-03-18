package Day16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *   实现ArrayList方法
 * */
public class ArrayListTest {
    public static void main(String[] args) {
        ArryListT alt=new ArryListT();
        alt.add("a");
        alt.add("a1");
        alt.add("a2");
        alt.add("a3");
        alt.add("a4");
        alt.add("a5");
        //截取有点问题 报错“ArrayIndexOutOfBoundsException”
        // ArryListT alt1=alt.subList(2,3);
        System.out.println(alt.contains("a1"));
    }
}

class ArryListT {
    //底层数组
    private String[] data;
    //定义一个记录实际使用长度的变量
    private int size = 0;

    //构造方法
    public ArryListT() {
        //初始容量为10
        data = new String[10];
    }

    //**提供指定初始容量构造方法
    public ArryListT(int len) {
        if (len < 0) {
            //参数不合法异常
            throw new IllegalArgumentException();
        }
        data = new String[len];
    }

    //添加元素
    public void add(String str) {
        //每次添加元素的时候判读是否需要扩容
        if (size >= data.length) {
            this.grow();
        }
        data[size++] = str;
    }

    //提供扩容方法
    //****扩容原来一半
    private void grow() {
        if (data.length <= 1) {
            data = Arrays.copyOf(data, data.length+1);
        } else {
            //扩容
            data = Arrays.copyOf(data, data.length + (data.length >> 1));
        }
    }

    //插入元素：位置越界判断，是否扩容，操作
    public void add(int index, String str) {
        //判断是否越界
        this.out(index);
        //是否需要扩容
        if (size >= data.length) {
            this.grow();
        }
        //让指定索引后的元素向后移动一个
        for (int i = size - 1; i > index; i--) {
            data[i + 1] = data[i];
        }
        //或者
        // System.arraycopy(data,index,data,index-1,size-index);
        //存放插入的数据
        data[index] = str;
        size++;
    }

    //***越界判断方法
    public void out(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("越界");
        }
    }
    //***元素首次出现的索引
    public int indexOf(String str) {
        for (int i = 0; i < size; i++) {
            // **equals比较字符串是否相等
            if (data[i] == str || data[i] != null && data[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    //删除元素
    public void remove(int index) {
        //越界
        this.out(index);
        /*for (int i = size; i < index+1 i--) {
            data[i-1] = data[i];
        }*/
        System.arraycopy(data, index, data, index + 1, size - (index + 1));
        size--;
    }
    //删除指定的元素
    public void remove(String str) {
        //调用indexOf方法，找到指定i位置的元素
        int i = indexOf(str);
        if (i != -1) {
            remove(i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    //获取指定索引处的元素
    public String get(int index) {
        this.out(index);
        return data[index];
    }

    //修改指定索引处的元素
    public void set(int index, String str) {
        this.out(index);
        //覆盖掉修改
        data[index] = str;
    }

    //清空集合
    public void clear() {
        //创建一个新的
        data = new String[10];
        size = 0;
    }

    //判断是否包含某一个元素
    public boolean contains(String str) {
        //等于1就找到
        return indexOf(str) != -1;
    }

    //获取实际长度
    public int size() {
        return size;
    }

    //是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //截取子列表
    public ArryListT subList(int formIndex, int toIndex) {
        //越界判断
        this.out(formIndex);
        this.out(toIndex);
        if (formIndex > toIndex) {
            throw new IllegalArgumentException("参数不合法");
        }
        //创建子列表,长度指定toIndex - formIndex
        ArryListT sublist = new ArryListT(toIndex - formIndex);
        //拷贝，从for-to拷贝
        //拷贝到sublist对象中的的data数组中，从0位开始复制
        System.arraycopy(this.data, formIndex, sublist.data, 0, toIndex);
        //长度设置
        sublist.size = toIndex - formIndex;
        return sublist;
    }
    //重写toString
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i <size ; i++) {
            if(i==(size-1)){
                sb.append(data[i]);
            }else {
                sb.append(data[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

