package APIdemo;

import java.util.Scanner;

/*
* 输入一个字符串，统计字符出现的次数
* */
public class TestString3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        //转化为数组
        boolean[] bs=new boolean[s.length()];
        for (int i = 0; i <bs.length ; i++) {
            if(bs[i]){
                //跳过这次循环
                continue;
            }
            //能执行到这行，i位置还没被标记
            int count=0;
            //获取i位置的字符
            char c=s.charAt(i);
            for (int j = i; j <s.length() ; j++) {
                if(c==s.charAt(j)){
                    count++;
                    bs[j]=true;
                }
            }
            System.out.println(c+":"+count);
        }
    }
}
