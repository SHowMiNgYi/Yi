package Day16;

import java.util.ArrayList;
import java.util.Collection;

/*
*   集合
*
* */
public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合
        Collection<String> coll=new ArrayList<String>();
        //添加元素
        coll.add("a");
        coll.add("b");
        coll.add("c");
        //清空集合中的元素
        //coll.clear();
        System.out.println(coll);

        //将集合转换为数组
        String[] ob=coll.toArray(new String[0]);
        for (String obj:ob) {
            System.out.println(obj);
        }
    }
}
