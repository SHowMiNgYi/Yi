package APIdemo;

//字符串数组中有100个元素，分别使用String 类的+ 拼接字符串和StringBuilder的append拼接。
// 看运行速度
public class StringDemo {
    public static void main(String[] args) {
        String a="a";
        long startTime=System.currentTimeMillis();//获取开始时间
        /*for(int i=1;i<=100000;i++){
            a+="c";
        }*/

        StringBuilder s=new StringBuilder("b");
        for(int j=1;j<=10000000;j++){
            s.append("c");
        }
        String s1=s.toString();
        long endTime=System.currentTimeMillis();//获取结束时间
        System.out.println("字符串+运行时间： "+(endTime-startTime)+"ms");
    }
}
