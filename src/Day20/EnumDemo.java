package Day20;
/*
    枚举
* */
public class EnumDemo {
    public static void main(String[] args) {
        Season s = Season.Spring;
        switch(s){
            case Spring:
//			s.play();
                System.out.println("春天出去踏青");
                break;
            case Summer:
                System.out.println("夏天出去晒被子");
                break;
            case Autumn:
                System.out.println("出去看枫叶");
                break;
            case Winter:
                System.out.println("可以堆雪人");
                break;
        }
    }
}
enum Season{
    // 定义枚举的内容必须在类的有效代码的首行
    // public final static Season Spring = new Season();
    Spring(3) {
        @Override
        public void play() {
            // TODO Auto-generated method stub
            System.out.println("浅草才能没马蹄");
        }
    },Summer {
        @Override
        public void play() {
            // TODO Auto-generated method stub
            System.out.println("去湖里游泳");
        }
    },Autumn {
        @Override
        public void play() {
            // TODO Auto-generated method stub
            System.out.println("吃月饼");
        }
    },Winter {
        @Override
        public void play() {
            // TODO Auto-generated method stub
            System.out.println("打雪仗");
        }
    };
    private int mouth;

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }
    private Season(){

    }

    private Season(int mouth){
        this.mouth = mouth;
    }

    // 声明抽象方法
    // 一个类中如果有抽象方法，那么这个类就是抽象类
    // 抽象类不能够直接被实例化
    public abstract void play();
}
