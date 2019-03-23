package Day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* // 创建一个学生对象
		Student stu = new Student();
		stu.setName("赵本山");
		stu.setAge(60);
		Student stu1 = new Student();
		stu.setName("赵本山");
		stu.setAge(60);
		HashSet<Student> list = new ArrayList<>();
		list.add(stu);
		list.add(stu1);*/


        /*//序列化 -->将对象转换为字节
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p.data"));
		// 将stu对象转换为字节
		oos.writeObject(stu);
		// 关流
		oos.close();*/

        // 反序列化 -->将字节转换为对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p.data"));

        Student stu1 =(Student)ois.readObject();

        System.out.println(stu1.getName());
        // 关流
        ois.close();
    }
}

class Student implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -3421452080747630979L;
    // NotSerializableException:需要序列化的类要实现接口
    // Serializable是一个空接口，只是对类做一个标识
    // 实现这个接口的类，可以被序列化
    private String name;
    private int age;
    static String classRoom = "502";
    transient private int height;
    int score;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
