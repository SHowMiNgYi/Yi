package Day15;

public class ExceptionDemo {
    public static void main(String[] args) {
        Person p=demo();
        System.out.println(p);
    }

    public static Person demo(){
        Person p=null;
        try {
            p=new Person();
            p.setName("独孤求败");
            p.setAge(40);
            //将p对象挂起，
            //这里返回的是对象的地址
            return p;
        }finally {
            //p=new Person();
            p.setName("扫地僧");
            p.setAge(80);
        }
    }
}

class Person{
    private String  name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
