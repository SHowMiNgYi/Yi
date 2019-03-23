package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
*
*   多个文件合并,拷贝
* */
public class SequenceDemo {
    public static void main(String[] args) throws IOException {
        //创建Vector迭代器
        Vector<FileInputStream> vector=new Vector<>();
        //创建多个流
        FileInputStream fis1=new FileInputStream("d:\\a.txt");
        FileInputStream fis2=new FileInputStream("d:\\B.txt");
        FileInputStream fis3=new FileInputStream("d:\\C.txt");

        vector.add(fis1);
        vector.add(fis2);
        vector.add(fis3);

        //获取迭代器
        Enumeration<FileInputStream> e=vector.elements();
        // 使用合并流 -->创建对象
        // 合并流：使用SequenceInputStream进行多个流的数据读取
        // 再使用字节输出流进行输出。
        SequenceInputStream sis=new SequenceInputStream(e);
        //创建字节输出流
        FileOutputStream fos=new FileOutputStream("d:\\678.txt");
        //创建字节数组
        byte[] bys=new byte[1024];
        int len;
        //循环读取多个数据
        while ((len=sis.read())!=-1){
            //读取数据
            fos.write(bys,0,len);
        }
        //关闭流
        fos.close();
        sis.close();
    }
}
