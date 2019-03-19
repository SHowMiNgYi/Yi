package Day18;
/*
 *   删除目录（写成一个方法：获取这个目录下的子文件和子目录--遍历数组---
 *   ---如果是子文件的话，直接删除；如果是子目录的话，后续的功能和当前的方法功能一直的，
 *   直接调用当前方法--递归）
 *
 * */

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //将路径与对象进行关联
        File file = new File("E:\\aaa");
        delFile(file);
    }

    private static void delFile(File file) {
        //判断file是否为null
        if (file == null) {
            throw new NullPointerException();
        }
        //判断是一个目录还是一个文件
        if (file.isDirectory()) {
            //如果是目录，获取当前目录下的所有子文件和子目录
            File[] fs = file.listFiles();
            //遍历数组
            for (File f : fs) {
                //获取到该file对象之后，需要再判断这个f是一个子文件还是一个子目录
                //递归
                delFile(f);
            }
        }
        file.delete();
    }
}
