package MThread;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoin extends RecursiveTask {
    private final int threshold = 2;
    int start;
    int end;

    public ForkJoin(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object compute() {
        int res = 0;
        boolean canCount = end - start <= 2;
        if (canCount) {
            for (int i = start; i <= end; i++) {
                res = res + i;
            }
        } else {
            int mid = (end - start) / 2;
            ForkJoin left = new ForkJoin(start, mid);
            ForkJoin right = new ForkJoin(mid + 1, end);
            left.fork();
            right.fork();
            int leftres = (int) left.join();
            int righrest = (int) right.join();
            res = leftres + righrest;
        }
        return res;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ForkJoin forkJoin = new ForkJoin(1, 4);
        ForkJoinPool pool = new ForkJoinPool();
        Future future = pool.submit(forkJoin);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("forkjoin spend" + (end - start));

        long start1 = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            sum = sum + i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println(sum + "spend" + (end1 - start1));
    }

}
