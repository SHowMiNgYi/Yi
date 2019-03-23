package Day20;
/*
*
* 电影院卖票。总共100张，有三个窗口卖票。用多线程计数，模拟卖票
* RunTest代表票
* */
public class RunTest implements Runnable{
    int tot=100;

    @Override
    public void run() {
        Object obj=new Object();
        while (true){
            //同步代码块
            //synchronized锁对象，可以是任意对象，多线程要保证锁对象是相同对象
            synchronized (obj){
                if (tot>0){
                    System.out.println(Thread.currentThread().getName()+"正在出售"+tot--);
                }
            }
           //method();
        }
    }

    //被synchronized修饰的方法--同步方法
    /*public synchronized void method(){
        if (tot>0){
            System.out.println(Thread.currentThread().getName()+"正在出售"+tot--);
        }
    }*/
}
