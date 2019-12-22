package MThread;

import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;
import static java.util.stream.Collectors.toList;

/**
 * Create by jingzfan on 2019/4/27.
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1, 3).mapToObj(ThreadJoin::creat).collect(toList());
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
            sleep(1000);
        }
    }

    private static Thread creat(int i) {
        return new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName() + "--" + j);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
