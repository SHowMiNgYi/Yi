package Day10;

public class StaticDemo2 {
    public static void main(String[] args) {
        //System.out.println(new SDText().i);
        //System.out.println(SDText.x+","+SDText.y);
    }
}
class SDText{
    /*
    *   加载
    *   静态区，赋予初始值   第一句 第二句 第三句
    *   sd      null        0X001   0X001   0X001
    *   x       0           1       3       3
    *   y       0           1       1       1
    *
    *
    *   static只执行一次
    *   没有static会一直调用方法，导致栈溢出
    * */
    /*static SDText sd =new SDText();
    static int x=3;
    static int y;
    public SDText(){
        x++;
        y++;
    }*/


    /*定义成员变量并有值，执行构造代码块的内容，给成员变量赋值。最后输出6*/
    /*int i=1;
    {
        i+=6;
        System.out.println("构造代码块在int i 的下面");
    }*/

    /*JAVA开始进行编译和执行，读到i=3，发现没有具体类型，
    * 从上下文开始找吗，发现没有。会把i(标记)为成员变量，此时这个标记
    * 只能赋值没做不了任何操作，往下找到同名的定义就会把标记给变量*/
    /*{
        i=3;
        System.out.println("构造代码块在int i的上面");
    }
    int i=1;*/
}
