package Test;

public class MyClass {
    public static void main(String[] args) {
        My s1=new My(6);
        My s=new My(5);
        System.out.println(My.getCount());
    }
}

class My{
    //静态成员变量存总数
    private static int count=0;

    My(int count){
        ++count;
    }

    public static int getCount() {
        return count;
    }
}
