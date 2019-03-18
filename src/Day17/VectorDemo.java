package Day17;

import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(10,5);
        for (int i = 0;i < 11;i++){
            v.add("abc");
        }
        // 获取迭代器
        Enumeration<String> e = v.elements();
        // 判断是否有下一个元素，如果有下一个元素，那么返回true
        while (e.hasMoreElements()){
            // 获取下一个元素
            String s = e.nextElement();
            System.out.println(s);
        }


        // 获取容量
        System.out.println(v.capacity());
    }
}
