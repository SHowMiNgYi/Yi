package Day13;

import java.util.Scanner;

/*
 * 输入一个字符串和一个子串，输出子串在字符串中出现的所有位置
 * */
public class TestIndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        System.out.println("请输入子串：");
        String str1 = sc.next();

        //********定义索引
        int index = 0;
        while (index < str.length()) {
            //找子串返回值
            index = str.indexOf(str1, index);
            if (index != -1) {
                System.out.println(index);
                index++;
            } else {
                break;
            }
        }
    }
}
