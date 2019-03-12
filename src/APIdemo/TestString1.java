package APIdemo;

import java.util.Scanner;

/*
* 输入一个字符串以及2个数字，按照数字对字符串进行截取
*           统计字符串中出现的数字之和
* */
public class TestString1 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner s=new Scanner(System.in);
        String sc=s.next();
        //转换为数组
        char[] c=sc.toCharArray();

        System.out.println("请输入2个数字");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a<0||a>b||b>c.length){
            System.out.println("输入错误");
            return;
        }

        //截取一段转换为字符串
        String str=new String(c,a,b-a);
        System.out.println(str);
    }
}
