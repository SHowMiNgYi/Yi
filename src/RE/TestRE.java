package RE;

import java.util.Scanner;

/*
* 输入一个字符串，判断这个字符串是否是小数
* */
public class TestRE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.println(str.matches("-?0\\.\\d+")|str.matches("|-?[1-9]\\d*\\.\\d+"));
    }
}
