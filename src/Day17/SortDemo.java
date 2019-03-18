package Day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class SortDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("cbo");
        list.add("cao");
        list.add("tpo");
        list.add("foe");
        list.add("nba");
        System.out.println(list);
        // 将list中的内容按照首字符进行排序
        list.sort(new Comparator<String>() {
            @Override
            // 比较两个字符串的首字符的差值
            // o1的字符如果大于o2的字符(返回值是正数)，那么表示o2排在o1前面
            // o1的字符如果小于o2的字符(返回值是负数), 那么表示o2排在o1后面
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.charAt(0) - o2.charAt(0);
            }

        });

        System.out.println(list);
    }
}
