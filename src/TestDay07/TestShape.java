package TestDay07;
/*
*   a:圆形类：属性：半径；方法：求周长，面积
*   b:矩形类：属性：长、宽；方法：求周长，面积
*   c:正方形类--是特殊的矩形：属性：边长；方法：求周长，面积
* */
public class TestShape {
    public static void main(String[] args) {
        //矩形
        Shape s=new Rect(4,5);
        System.out.println("矩形周长："+s.getGirth());
        System.out.println("矩形面积："+s.getArea());
        //圆形
        Shape s1=new Circle(2);
        System.out.println("圆形周长："+s1.getGirth());
        System.out.println("圆形面积："+s1.getArea());
        //正方形
        Shape s2=new Square(5);
        System.out.println("正方形周长："+s2.getGirth());
        System.out.println("正方形面积："+s2.getArea());
    }
}
class Shape{
    private double x;
    private double y;

    public Shape(double x,double y){
        this.x=x;
        this.y=y;
    }

    //周长、面积方法
    public double getGirth(){
        return 0;
    }
    public double getArea(){
        return 0;
    }

    //set、get方法

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

//圆类
class Circle extends Shape{
    public Circle(double x){
        super(x, x);
    }
    @Override
    public double getGirth(){
        return 2*3.14*getX();
    }
    @Override
    public double getArea(){
        return 3.14*getX()*getX();
    }
}

//矩形
class Rect extends Shape{
    public Rect(double x,double y){
        super(x, y);
    }
    @Override
    public double getArea(){
        return getX()*getY();
    }
    @Override
    public double getGirth(){
        return 2*(getX()+getY());
    }
}

//正方形
class Square extends Rect{
    public Square(double x){
        super(x,x);
    }
}