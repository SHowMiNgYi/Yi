package Day10;

public class FinalDemo2 {
    public static void main(String[] args) {
        //new FD().i+1;
    }
}

class FD{
    //生命周期，在创建对象之前赋值（构造代码块、构造方法）
    //final 和static共同修饰--静态常量保证在类加载完之前赋值
    static final int i;
    static{
        i=1;
    }
    /*{
        i=9;
    }*/
    public FD(){
        //i=1;
    }
}
