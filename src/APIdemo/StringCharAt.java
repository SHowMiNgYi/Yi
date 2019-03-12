package APIdemo;

public class StringCharAt {
    public static void main(String[] args) {
        //chaAt获取索引处的字符
        System.out.println("abc".charAt(2));
        //将字符串转换为字符数组
        String str ="asd";
        char[] chs=str.toCharArray();
        for (int i = 0; i <chs.length ; i++) {
            System.out.println(chs[i]);
        }
        //将字符数组转换成字符串
        String str1=new String(chs);
        System.out.print(str1);

        String str2=new String(chs,0,3);
        System.out.println("\n"+str2);
    }
}
