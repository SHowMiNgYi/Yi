package Day19;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandmDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        RandomAccessFile f=new RandomAccessFile("d:\\aa.txt","rw");
        //写入数据
        f.write("123".getBytes());
        //将底层的字节数组的索引设置为指定索引
        f.seek(3);
        f.skipBytes(2);
        System.out.println((char) f.read());
    }
}
