package Day17;

import java.util.Arrays;
import java.util.EmptyStackException;

public class stackDemo2 {
    public static void main(String[] args) {
        StackTest at = new StackTest();
        at.push("a");
        at.push("b");
        at.push("c");
        at.push("d");
        System.out.println(at.search("b"));
    }
}

class StackTest{
    private String[] data = new String[10];
    private int size = 0;
    public StackTest(){

    }

    // 判断栈是否为空
    public boolean empty(){
        return size == 0;
    }
    // 弹栈，不删除栈中对应的元素
    public String peek(){
        if (size == 0){
            // 如果内容长度为0，那么抛出空栈异常
            throw new EmptyStackException();
        }
        return data[size - 1];
    }

    // 弹栈，删除栈中对应的元素
    public String pop(){
        if (size == 0){
            // 如果内容长度为0，那么抛出空栈异常
            throw new EmptyStackException();
        }
        String str = this.peek();
        size--;
        return str;
    }



    // 压栈
    public void push(String str){
        // 判断是否需要扩容
        if (size >= data.length){
            // 扩容两倍
            data = Arrays.copyOf(data, data.length * 2);
        }

        data[size] = str;
        size++;
    }

    // 搜索
    public int search(String str){
//		for (int i =size - 1;i>=0;i--){
//			if (data[i] == str || data[i] != null && data[i].equals(str)){
//				return size - i;
//			}
//		}

        // j 来记录当前的位置(由1开始)
        for (int i = size - 1,j = 1;i >= 0;i--,j++){
            if (data[i] == str || data[i] != null && data[i].equals(str)){
                return j;
            }
        }

        return -1;
    }
}