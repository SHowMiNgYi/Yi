package Day09;

public class B extends A{
    public static void main(String[] args) {
        //对象调用方法--访问
        //new A().m();
        B b=new B();
        b.m();
    }
}

class C extends A{
    public static void main(String[] args) {
        B b=new B();
        //被protected修饰的方法，子类对象要在子类中使用
        //b.m();
    }
}
