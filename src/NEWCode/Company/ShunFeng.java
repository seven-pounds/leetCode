package NEWCode.Company;

import java.util.Scanner;

public class ShunFeng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long[] dp = new long[arr.length];
        long[] ends = new long[arr.length];
        ends[0] = arr[0];
        dp[1] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for (int i = 1; i < arr.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (arr[i] >= ends[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            right = Math.max(right, 1);
            ends[l] = arr[i];
            dp[i] = l + 1;
        }
        System.out.println(arr.length - 1);
    }
}
