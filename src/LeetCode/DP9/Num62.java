package leetcode;

public class Num62 {
    public static void main(String[] args) {
        uniquePaths(7,3);
    }
    public static int uniquePaths(int m, int n) {
        int [][] memo = new int[m+1][n+1];
        for (int i = 1; i <=n ; i++) {
            memo[1][i]=1;
        }
        for (int i = 1; i <=m ; i++) {
            memo[i][1]=1;
        }
        for (int i = 2; i <=m ; i++) {
            for (int j = 2; j <=n ; j++) {
                memo[i][j]=memo[i][j-1]+memo[i-1][j];
                System.out.print(memo[i][j]+" ");
            }
            System.out.println();
        }
        return memo[m][n];

    }

}
