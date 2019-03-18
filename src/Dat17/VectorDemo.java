package Dat17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*   Vector 查询速度快，增删速度慢。
*       线程安全的集合
* */
public class VectorDemo {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //获取迭代器 Iterator
        Iterator<String> it=list.iterator();
        //判断是否是下一个元素
        while (it.hasNext()){
        }
        System.out.println(list);
    }
}
