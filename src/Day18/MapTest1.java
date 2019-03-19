package Day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest1 {
    public static void main(String[] args) {
        System.out.println("请输入字符：");
        String str = new Scanner(System.in).next();

        //创建一个map
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            //获取每一个字符   charAt
            char c = str.charAt(i);
            //字符和key比较  containsKey：是否包含
            if (map.containsKey(c)) {
                //找到相同的字符
                //获取对应的Value 用get
                Integer value = map.get(c);
                //有相同对应value加1
                value += 1;
                //put将制定的value映射到对应的键值对
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        //增强for循环遍历输出
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + "出现的次数为：" + en.getValue());
        }
    }
}
