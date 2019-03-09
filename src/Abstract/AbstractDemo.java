package Abstract;

/*
abstract抽象
    类中的方法抽象，类也要抽象
*/
public class AbstractDemo {
    public static void main(String[] args) {
        //输出矩形类
        Shape s = new Rectangle(4, 5);//向上造型
        System.out.println("面积：" + s.getArea());
        System.out.println("周长：" + s.getGurth());

        //匿名内部类

        Shape s3=new Shape(1,2) {
            @Override
            public double getArea() {
                return 0;
            }
        };
    }
}

//图形类
abstract class Shape {
    //私有属性
    private double x;
    private double y;

    //有参构造
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //面积方法
    public abstract double getArea();

    //周长方法
    public double getGurth() {
        return 0.0;
    }

    //get\set方法
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

//矩形类
class Rectangle extends Shape {
    //继承，调父类的无参构造，没有自写
    public Rectangle(double x, double y) {
        super(x, y);
    }

    //重写，父类Shaope的getArea方法
    @Override
    public double getArea() {
        return getX() * getY();
    }

    @Override
    public double getGurth() {
        return 2 * (getX() + getY());
    }
}

//正方形
class Square extends Rectangle {
    public Square(double x) {
        super(x, x);
    }
}

//圆形
class Circle extends Shape {
    public Circle(double x) {
        super(x, x);
    }

    @Override
    public double getArea() {
        return 3.14 * getX() * getX();
    }

    @Override
    public double getGurth() {
        return 2 * 3.14 * getX();
    }
}
