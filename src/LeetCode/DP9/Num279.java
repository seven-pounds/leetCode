package LeetCode.DP9;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Num279 {
    public static void main(String[] args) {
        numSquares(13);
    }
//    int[]memo;
//    public int numSquares(int n) {
//        memo=new int[n+1];
//        return dpHelper(n);
//    }
//    public  int dpHelper(int n){
//        for (int i = 1;i<=n;i++)  memo[i]=i;
//        for (int i = 2; i <= n; i++) {
//            for (int j = 1; j*j <=i ; j++) {
//                memo[i]=Math.min(memo[i],memo[i-j*j]+1);
//            }
//        }
//        return memo[n];
//    }

    public static int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(0);
        visited.add(0);

        int distance = 0;
        while (!queue.isEmpty()) {
            distance++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                for (int j = 1; j * j + curr <= n; j++) {
                    int next = j * j + curr;
                    if (next == n) return distance;
                    if (next < n && !visited.contains(next)) {
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
        }

        return distance;
    }

}
