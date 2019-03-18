package Day16;

import java.util.ArrayList;

/*
*   ArrayList类是List接口的一个实现类
*       长度是不固定的默认为10
*       ** ArrayList是线程不安全的，增删速度慢，查询速度快
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add("a");
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
