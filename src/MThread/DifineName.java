package MThread;

import java.util.stream.IntStream;

/**
 * Create by jingzfan on 2019/4/23.
 */
public class DifineName {
    private final static String PRE = "ALEX-";

    public static void main(String[] args) {
        IntStream.range(0, 5).mapToObj(DifineName::creat).forEach(Thread::start);
    }

    private static Thread creat(int i) {
        return new Thread(() -> System.out.println(Thread.currentThread().getName()), PRE + i);
    }
}
