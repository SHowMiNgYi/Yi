package Day20;
/*
* 测试买票类
* */
public class RunTests {
    public static void main(String[] args) throws InterruptedException {
        //创建实现Runnable类的对象
        RunTest t=new RunTest();
        //创建三个窗口
        Thread thread1=new Thread(t,"窗口一");
        Thread thread2=new Thread(t,"窗口二");
        Thread thread3=new Thread(t,"窗口三");

        //开启线程卖票
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
