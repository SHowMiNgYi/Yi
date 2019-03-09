package Test;

class A{
    static int c=0;
    public A(){
        c++;
        System.out.println(c);
    }
}

public class TestDemo{
    public static void main(String args[]){
        A mc1=new A();
        A mc2=new A();
    }
}
