package Day18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOFileWriter {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fw=new FileWriter("a.txt");
        //向文件中写入内容（写到缓冲区）
        fw.write("古丰索");
        //冲刷缓冲区
       // fw.flush();
        //关闭资源,会自动冲刷一次缓冲区
        fw.close();
    }
}
