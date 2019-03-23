package Test;
/*

    用list集合中的方法 ,存储 10 个 1-50(含 50)的随机偶数元素 ,
    要求数字不能重复 ,添加完成后从大到小倒序遍历输出到控制台并使用 IO 流将集合中的元素输出到D盘的 num.txt 中
* */
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class AddArrya {
    public static void main(String[] args) throws IOException {
        //创建链表
        ArrayList<Integer> list = new ArrayList<Integer>();

        /*生成1-50以内的10个偶数随机数*/
        int num = 0;
        Random rand = new Random();
        while (list.size() < 10) {
            num = rand.nextInt(100);
            //判断数字不重复且为偶数
            if (!list.contains(num) && num % 2 == 0) {
                list.add(num);
            }
        }
        System.out.println("排序前：" + list);

        /*排序后输出*/
        int[] a=new int[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i]=list.get(i);
        }
        //正序数组a
        Arrays.sort(a);
        ArrayList<Integer> list1=new ArrayList<Integer>();
        //排序后给list1
        for (int j = 0; j < a.length; j++) {
            list1.add(j,a[j]);
        }
        //倒序list1
        Collections.reverse(list1);
        System.out.println("排序后："+list1);

        /*写入文件中*/
        PrintStream out=new PrintStream("C:\\Users\\Administrator\\Desktop\\1.txt");
        Iterator<Integer> it=list1.iterator();
        while(it.hasNext()){
            Integer numA=it.next();
            out.print(numA);
            out.print(",");
        }
        out.flush();
        out.close();
    }
}