package Day09;

public class ExtendsDemo {
    public static void main(String[] args) {

    }
}

class Animal {
    public Animal(int age) {

    }

    public void eat() {
        System.out.println("在吃东西");
    }

    public void sleep() {
        System.out.println("在睡觉");
    }
}

class Pig extends Animal {
    //子类所有的构造方法都要去调用父类的无参构造（默认）
    public Pig() {
        //super在子类中调用父类的构造方法
        super(1);
    }

    public Pig(int age) {
        //this();
        super(age);
    }

    public void eat() {
        System.out.println("111");
        System.out.println("222");
        System.out.println("333");
        //父类方法
        //非静态的方法可以通过对象调用
        //super---代表父类的对象
        super.sleep();
    }
}
