package Day19;
/*
*
*   用流，在控制台输入输出一行信息
*
* */
import java.io.*;

public class IOSyestem {
    public static void main(String[] args) throws IOException {
        //创建流
        //new InputStreamReader字节流转换为字符流
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //读
        String str=br.readLine();
        System.err.println(str);
    }
}
