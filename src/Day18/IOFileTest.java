package Day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*  流操作的过程
        创建流->流出数据->冲刷缓冲区->关闭流->流对象标记为null

     流异常处理
        1、创建前置为null
        2、try：进行操作 catch:抛异常
            finally:判断操作（流是否为空：不为空->try:关闭流 catch:抛异常 finally:流置为空）
        3、抛出异常
        5、关闭流
 *
 *   复制文件
 * */
public class IOFileTest {
    public static void main(String[] args) {
        //创建输出流
        FileReader reader = null;
        //创建写入流
        FileWriter writer = null;

        try {
            //复制要复制的数据
            reader = new FileReader("C:\\Users\\Administrator\\Desktop\\自我介绍.ppt");
            //写入数据到指定目录
            writer = new FileWriter("F:\\自我介绍.ppt");

            //冲刷
            writer.flush();
        } catch (Exception e) {
            //异常
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    //关闭流
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    //赋值为null
                    reader = null;
                }
            }
            if (writer != null) {
                try {
                    //关闭流
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    //赋值为null
                    writer = null;
                }
            }
        }
    }
}
