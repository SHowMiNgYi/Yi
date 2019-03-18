package Day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("蔡徐坤");
        list.add("潘长江");
        list.add("吴亦凡");
        list.add("杨超越");

        System.out.println(list);
        // 获取迭代器
        Iterator<String> it = list.iterator();
        // 判断是否有下一个元素
        while (it.hasNext()){
            String s = it.next();
            System.out.println("删除前 " + s);
            // list接口的删除方法
            // list接口的删除方法不支持一边遍历一边删除
//			list.remove(s);
            // 迭代器的删除方法
            // 删除的就是it.next()的这个元素
            it.remove();
//			System.out.println(it.next());
        }
        System.out.println(list);

    }
}
