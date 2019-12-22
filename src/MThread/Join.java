package MThread;

/**
 * Create by jingzfan on 2019/5/7.
 */
public class Join {
    public static void main(String[] args) {
        Thread pre = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new JoinThread(pre), String.valueOf(i));
            thread.start();
            pre = thread;
        }
//        System.out.println(Thread.currentThread().getName());
    }

    static class JoinThread implements Runnable {
        private Thread thread;

        public JoinThread(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
