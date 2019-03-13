package Day13;
/*
 * 输入一个字符串和一个数字，
 * */
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TesTgetBytes {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        int x=sc.nextInt();

        //判断是否合理
        if(x<0||x>str.length()){
            return;
        }
        //字符串转换为字符数组
        byte[] bs=str.getBytes("gbk");
        //截取内容
        String sub =new String(bs,0,x,"gbk");
        //获取sub最后一个字符的索引
        int index=sub.length()-1;
        //判断sub的最后一个字符是否是半截字符，判断index位置的字符和str的index位置的字符是否相等
        if(sub.charAt(index)!=str.charAt(index)){
            sub=new String(bs,0,x-1,"gbk");
        }

        System.out.println(sub);
    }
}
