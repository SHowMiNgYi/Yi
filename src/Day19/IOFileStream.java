package Day19;
/*
*       字节流拷贝文件
*
* */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileStream {
    public static void main(String[] args) throws IOException {
        //输入
        FileInputStream fi=new FileInputStream("D:\\");
        //输出
        FileOutputStream fo=new FileOutputStream("E:\\");

        //读取信息，再将信息写入到文件中
        byte[] bys=new byte[1024];
        int len;
        while ((len=fi.read(bys))!=-1){
            //读取成功后，写入文件
            fo.write(bys,0,len);
        }
        //关流
        fo.close();
        fi.close();
    }
}
