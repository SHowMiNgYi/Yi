package APIdemo;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char[] chs=s.toCharArray();
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 0; i < chs.length; i++) {
            //小写
            if(chs[i]>='A'&&chs[i]<='Z'){
                count++;
            }
            //大写
            else if(chs[i]>='a'&&chs[i]<'z'){
                count1++;
            }
            //数字
            else if(chs[i]>=0&&chs[i]<=9){
                count2++;
            }
            else {
                count3++;
            }
        }
        System.out.println("大写："+count);
        System.out.println("小写："+count1);
        System.out.println("数字："+count2);
        System.out.println("其他字符："+count3);
    }
}
