package LeetCode.DP9;

public class Num279 {
    int[]memo;
    public int numSquares(int n) {
        memo=new int[n+1];
        return dpHelper(n);
    }
    public  int dpHelper(int n){
        for (int i = 1;i<=n;i++)  memo[i]=i;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j*j <=i ; j++) {
                memo[i]=Math.min(memo[i],memo[i-j*j]+1);
            }
        }
        return memo[n];
    }
}
