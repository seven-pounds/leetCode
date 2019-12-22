package MThread;

/**
 * Create by jingzfan on 2019/5/6.
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread wait = new Thread(new Wait(), "wait");
        wait.start();
        Thread.sleep(1000);
        Thread notify = new Thread(new Notify(), "notify");
        notify.start();
    }

    static class Wait implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
            }

        }
    }

    static class Notify implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
