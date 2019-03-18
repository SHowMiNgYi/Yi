package Day16;

import java.util.ArrayList;
import java.util.List;

/*
*   Linst接口，是有序集合，提供***索引
* */
public class ListDemo {
    public static void main(String[] args) {
        //创建list
        List<String> list=new ArrayList<String>();
        list.add("西门吹雪");
        list.add("李寻欢");
        list.add("小鱼儿");
        list.add("无情子");
        System.out.println(list);

        //索引
        list.add(2,"老实和尚");
        //list.add(6,"a");
        //IndexOutOfBoundsException,索引越界异常
        //查看是否包含元素
        boolean b=list.contains("老实和尚");
        System.out.println(b);
        //截取子列表，包头不包尾
        List<String> subList = list.subList(1,3);
        System.out.println(subList);

        //比较方法
        //底层逐位比较
        List<String> list1=new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2=new ArrayList<String>();
        list2.add(new String("a"));
        list2.add("b");
        list2.add("c");
        list2.add("d");
    }
}
