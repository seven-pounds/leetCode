package MThread;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

// java
public class JCP1_Deprecated {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Thread print = new Thread(new Run(), "print");
        print.setDaemon(true);
        print.start();
        System.out.println("start at" + format.format(new Date()));
        print.suspend();
        System.out.println("suspend at" + format.format(new Date()));
        Thread.sleep(3000);
        print.resume();
        System.out.println("resume at" + format.format(new Date()));
        print.stop();
    }

    static class Run implements Runnable {

        @Override
        public void run() {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                System.out.println(Thread.currentThread().getName() + " run at" + format.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
