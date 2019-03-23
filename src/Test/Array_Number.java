package Test;
/*用list集合中的方法 ,存储 10 个 1-50(含 50)的随机偶数元素 ,
   */
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array_Number {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        List<Integer> list = new ArrayList<Integer>();
        stroeRandomNumber(intArr);
        storeInList(list, intArr);
        System.out.println(list);
        System.out.println("=================");
        getListElement(list);
    }

    /*
     * 遍历list集合，并将list中的元素一个一个放到num.txt中
     */
    public static void getListElement(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int d = list.get(i);
            putInNumber(d);

            System.out.print(d+",");
        }
    }

    /*
     * 把数组元素放到num.list中
     */
    public static void putInNumber(int d) {
        String str = d + "";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\num.txt", true);
            fos.write(str.getBytes());
            fos.write('-');
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex);
            throw new RuntimeException("写入失败！");
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                System.out.println(ex);
                throw new RuntimeException("释放资源失败！");
            }
        }
    }

    /*
     * 数组中的数存到List集合中
     */
    public static void storeInList(List<Integer> list, int[] intArr) {
        for (int d : intArr) {
                list.add(d);
            System.out.print(d+",");
        }
    }

    /*
     * 1，产生1-50的随机数，存到数组中
     */
    public static void stroeRandomNumber(int[] intArr) {
        for (int i = 0; i <10; i++) {
            Random rand = new Random();
            intArr[i] = (int) (1 + rand.nextDouble() * 50);// 生成[1.0-50.0]之间的随机数
        }
    }
}
