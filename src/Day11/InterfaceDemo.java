package Day11;

public class InterfaceDemo {
    public static void main(String[] args) {
        //创建对象
        Controller c=new Controller();
        c.play(0);
        c.stop(0);
        c.open(0);

        c.play(1);
        c.stop(1);
        c.open(1);

        c.play(2);
        c.stop(2);
        c.open(2);

        MediaPlayer player=new DVDPlayer();

    }
}

interface MediaPlayer {
    //播放
    public void play();

    //停止
    public void stop();

    //开仓
    public void open();
}

//DVD播放器
class DVDPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("播放DVD");
    }

    @Override
    public void stop() {
        System.out.println("停止播放DVD");
    }

    @Override
    public void open() {
        System.out.println("取出DVD");
    }
}

//CD播放器
class CDPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("播放CD");
    }

    @Override
    public void stop() {
        System.out.println("停止播放CD");
    }

    @Override
    public void open() {
        System.out.println("取出CD");
    }
}

//录音机
class TapePlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("播放录音机");
    }

    @Override
    public void stop() {
        System.out.println("停止播放录音机");
    }

    @Override
    public void open() {
        System.out.println("取出磁带");
    }
}

class Controller {
    private MediaPlayer[] players;

    //构造方法初始化数组
    public Controller() {
        //构造函数初始化players数组
        MediaPlayer[] m = new MediaPlayer[3];
        m[0] = new DVDPlayer();
        m[1] = new CDPlayer();
        m[2] = new TapePlayer();
        setPlayers(m);
    }

    //set、get方法
    public MediaPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(MediaPlayer[] players) {
        this.players = players;
    }

    //对相应的设别调用play、stop、open方法
    public void play(int i) {
        players[i].play();
    }
    public void stop(int i) {
        players[i].stop();
    }
    public void open(int i) {
        players[i].open();
    }
}
