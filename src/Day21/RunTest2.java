package Day21;

/*
 * 一个线程作生产者，一个线程作消费者。
 * 生产者和消费者同事执行，生产者每生产一次，消费者消费一次。
 * 生产和消费的数量使用随机数来表示。
 * 要求：生产的数量和上次消费的剩余数量和不能大于1000
 * */
public class RunTest2 {
    public static void main(String[] args) {
        Product p = new Product();
        //开辟线程
        new Thread(new SCZ(p)).start();
        new Thread(new XFZ(p)).start();
    }
}

class Product {
    private int count;
    //true 代表生产 false代表消费
    public boolean flag = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class SCZ implements Runnable {
    private Product p;

    public SCZ(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (p) {
                if (p.flag == false) {
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //能生产的最大数量
                int maxCount = 1000 - p.getCount();
                //计算生产的实际数量
                int count = (int) (Math.random() * (maxCount + 1));
                //设置可以消费的数量
                p.setCount(count + p.getCount());
                System.out.println("生产的数量：" + count + ","+"可消费的数量：" + p.getCount());
                p.flag = false;
                //唤醒
                p.notify();
            }
        }
    }
}

class XFZ implements Runnable {
    private Product p;

    public XFZ(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (p) {
                if (p.flag == true) {
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //计算消费的实际数量
                int count = (int) (Math.random() * (p.getCount() + 1));
                //设置可以消费的数量
                p.setCount(p.getCount() - count);
                System.out.println("消费的数量：" + count +","+ "剩余：" + p.getCount());
                p.flag = true;
                //唤醒
                p.notify();
            }
        }
    }
}
