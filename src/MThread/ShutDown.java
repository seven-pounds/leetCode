package MThread;

/**
 * Create by jingzfan on 2019/5/6.
 */
public class ShutDown {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runner(), "one");
        thread.setDaemon(true);
        thread.start();
        System.out.println("&&" + Thread.currentThread().getName() + System.currentTimeMillis());
        for (int i = 0; i < 1000000000; i++) {
        }
        System.out.println("=====" + Thread.currentThread().getName() + System.currentTimeMillis());
//        Thread.sleep(10);
        Thread.interrupted();
        System.out.println("&&" + Thread.currentThread().getName() + System.currentTimeMillis());
    }

    private static class Runner implements Runnable {
        private long i = 0;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                System.out.println("--" + i++);
            }
        }

        public void cancel() {
            on = false;
        }
    }
}
