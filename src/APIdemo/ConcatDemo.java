package APIdemo;

public class ConcatDemo {
    public static void main(String[] args) {
        String str ="abcef";
        //concat 将参数的字符串拼接后返回一个新的字符串
        /*System.out.println(str.concat("ert"));
        System.out.println(str);*/
        //contains 判断字符串中是否包含这个字符
        //System.out.println(str.contains("abh"));
        //endsWith 以。。。结尾。判断结尾与原字符尾是否匹配--判断文件的后缀
        System.out.println(str.endsWith("ef"));
        //以。。。开头--路径、网址
        System.out.println(str.startsWith("a"));
        //先比较地址，再比较长度，最后逐位比较8
        System.out.println(str.equals("abcdef"));
    }
}
