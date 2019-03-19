package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

/*
 *
 *   遍历Mpa
 * */
public class MapTest {
    public static void main(String[] args) {
        //创建Map
        Map<String,Integer> map=new HashMap<>();
        //拿到键值对的集合
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //获取迭代器iterator
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            //获取集合的元素
            Map.Entry<String, Integer> en = it.next();
            System.out.println(en.getKey() + "===" + en.getValue());
        }
        //第二种遍历
        //获取所有key的集合
        Set<String> set2 = map.keySet();
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            //获取key集合中的每一个元素
            String key = it2.next();
            Integer vlaue = map.get(key);
            System.out.println(key + "====" + vlaue);
        }
        //增强for循环遍历
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + "===" + en.getValue());
        }
    }
}
