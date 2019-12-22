package MThread;

import static java.lang.Thread.sleep;

/**
 * Create by jingzfan on 2019/4/26.
 */
public class TestSleep {
    public static void main(String[] args) {
        new Thread(() -> {
            long start = System.currentTimeMillis();

            sleep(2000);

            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }).start();

    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
