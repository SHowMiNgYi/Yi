package Abstract;

import java.io.UnsupportedEncodingException;

/*
*  getBytes:将字符串转换为字节数组（可以放编码格式）--默认当前工程的编码格式
* */
public class GetBytesDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="中国";
        byte[] bs=str.getBytes();
        System.out.println(bs.length);
        //将字节数组转换为字符串
        String str1=new String(bs,"utf-8");
        System.out.println(str1);
        String str2 =new String(bs,1,3,"utf-8");
        System.out.println(str2);
    }
}
