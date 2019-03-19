package Day18;
/*
*
* 统计一个文件下的.java和.class文件个数
*
* */
import java.io.File;

public class FileTest {
    static int javaCount=0;
    static int classCount=0;
    public static void main(String[] args) {
        //获取路径
        File file =new File("D:\\workspace");
        count(file);
        System.out.println(".java文件个数有："+javaCount);
        System.out.println(".class文个数件有："+classCount);
    }

    public static void count(File file){
        //判断是否为空
        if (file==null){
            throw new NullPointerException();
        }
       if (file.isDirectory()){
           //获取所有子目录或子文件
           File[] files=file.listFiles();
           for (File f:files) {
               //递归：不知道循坏到什么时候结束
               count(f);
           }
       }else if (file.getName().endsWith(".java")){
           javaCount++;
       }else if (file.getName().endsWith(".class")){
           classCount++;
       }
    }
}
