package MThread;

/**
 * Create by jingzfan on 2019/4/22.
 */
public class TiketWindow extends Thread {
    private final String name;
    private final static int MAX = 500;
    private static int index = 0;

    public TiketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index < MAX) {
            System.out.println("窗口" + name + "当前号码是：" + index);
            index++;
        }
    }

    public static void main(String[] args) {
        TiketWindow tiketWindow1 = new TiketWindow("1");
        tiketWindow1.start();
        TiketWindow tiketWindow2 = new TiketWindow("2");
        tiketWindow2.start();
        TiketWindow tiketWindow3 = new TiketWindow("3");
        tiketWindow3.start();
        TiketWindow tiketWindow4 = new TiketWindow("4");
        tiketWindow4.start();
    }
}
