package RE;
/*
*
* 匹配邮箱
*   前面由数字、字母、_组成
* */
public class TestRE2 {
    public static void main(String[] args) {
        String emil="132asd4687@qq.com";
        System.out.println(emil.matches("\\w{8,32}@\\w+(\\.com)")|emil.matches("\\w{8,32}@\\w+(\\.con)?(\\.cn+)"));
    }
}
