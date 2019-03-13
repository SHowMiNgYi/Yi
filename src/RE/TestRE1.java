package RE;
/*
 *
 * 判断一个密码是否符合规范：
 *   由8-12位组成
 *   大写、小写字母、数字、空格至少出现2种
 * */

import java.util.Scanner;

public class TestRE1 {
    public static void main(String[] args) {
        /*String str ="";
        //{n}：字符只能出现n次
        System.out.println(str.matches("\\d{5}"));
        //{n,}:字符出现的次数>=n
        //{n,m}:出现的次数n到m
        System.out.println(str.matches("\\d{5,}"));*/
        pwd("");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(pwd(str));

    }

    public static boolean pwd(String password) {
        //密码要求
        if (!password.matches("[A-Za-z\\d ]{8,12}")) {
            return false;
        }
        //定义一个变量，记录每种出现的次数
        int index = 0;
        //判断是否由小写、大写、数字、空格
        if (password.matches(".*[a-z].*")) {
            // .任意字符 *什么都没有
            //"[.*a-z].*" 小写字母无论在哪个位置
            index++;
        }
        if (password.matches(".*[A-Z].*")) {
            // .任意字符 *什么都没有
            //"[.*a-z].*" 大写字母无论在哪个位置
            index++;
        }
        if (password.matches(".*\\d.*")) {
            // .任意字符 *什么都没有
            //"[.*a-z].*" 数字无论在哪个位置
            index++;
        }
        if (password.matches(".* .*")) {
            // .任意字符 *什么都没有
            //"[.*a-z].*" 空格无论在哪个位置
            index++;
        }
        return index >= 2;
    }
}
