package Day21;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class DatagramTest {
    public static void main(String[] args) throws SocketException {
        //开辟新的线程
        new Thread(new Sender()).start();
        new Thread(new RevDemo()).start();
    }
}
//发送
class Sender implements Runnable{
    //创建
    DatagramSocket ds;
    Scanner sc;
    @Override
    public void run() {
        try {
            ds=new DatagramSocket();
            sc=new Scanner(System.in);
            while (true){
                //获取聊天信息
                String str=sc.next();
                //获取集装箱
                DatagramPacket dp=new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("localhost"),8090);
                //发送数据
                ds.send(dp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//接收
class RevDemo implements Runnable{
    //创建码头、集装箱
    DatagramSocket ds;
    DatagramPacket dp;

    @Override
    public void run() {
        try {
            ds=new DatagramSocket(8090);
            dp=new DatagramPacket(new byte[1024],1024);

            while (true){
                //接收数据
                ds.receive(dp);
                String strData=new String(dp.getData(),0,dp.getLength());
                System.out.println("IP："+dp.getAddress()+"说："+strData);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
