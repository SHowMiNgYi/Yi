package Day18;

import java.io.File;
import java.io.FileFilter;

/*
 * 提取所有的docx文件
 *
 * */
public class FileTest2 {
    static File docx = new File("E:\\DOCX");

    public static void main(String[] args) {
        File file = new File("E:\\aaa");
        get(file);
    }

    private static void get(File file) {
        //判断file是否为空
        if (file == null) {
            throw new NullPointerException();
        }
        //判断是否为一个目录
        if (file.isDirectory()) {
            //获取这个目录下的所有子目录和子文件
            File[] fs = file.listFiles();
            for (File f : fs) {
                //递归
                get(f);
            }
        } else if (file.getName().endsWith(".docx")) {
            //获取要提取文件的名字
            String name = file.getName();
            //然后去 . 最后一个出现的位置
            int index = name.lastIndexOf(".");
            //获取文件真正的名字
            final String fileName = name.substring(0, index);
            File[] fs = docx.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return name.matches(fileName + "-\\d+\\.docx") ||
                            name.matches(fileName + "\\.docx");
                }
            });
            //提取文件
            file.renameTo(new File(docx,fileName+
                    (fs.length==0?"":"-"+fs.length)+".docx"));
        }
    }
}
