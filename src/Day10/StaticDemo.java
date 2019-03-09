package Day10;

public class StaticDemo {
    public static void main(String[] args) {
        new SD();
    }
}
/*
先走父类静态--》再走子类静态--》再走父类对象--》子类对象
*/
class SD1{
    static{
        System.out.println("静态代码块1");
    }
    {
        System.out.println("构造代码块1");
    }
    public SD1(){
        System.out.println("无参构造1");
    }
}

class SD extends SD1{
    static int i;

    //静态代码块
    //static修饰的所有内容，随着类的加载而加载，只加载一次。与类同级
    static {
        i = 9;
        System.out.println("静态代码块");
    }

    {
        //构造代码块
        System.out.println("构造代码块");
    }

    public SD() {
        System.out.println("无参构造");
    }
}
