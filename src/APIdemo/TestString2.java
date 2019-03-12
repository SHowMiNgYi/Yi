package APIdemo;

import java.util.Scanner;

/*
 * 输入一个字符串，统计字符串中出现的数字之和
 *
 * */
public class TestString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //转化为数组
        char[] ks=s.toCharArray();
        int sum=0;
        for (char c:ks) {
            if(c>='0'&&c<='9'){
                sum+=(c-'0');
            }
        }
        System.out.println(sum);
    }
}
