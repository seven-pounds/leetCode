package NEWCode.Company;

import java.util.Scanner;

public class NetEasy9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int sum = 0;
        int index = 0;
        for (int i = 0; i < n - 2; i++) {
            int temp = 0;
            if (t[i] == 0) {
                temp = temp + a[i];
                if (t[i + 1] == 0) {
                    temp = temp + a[i + 1];
                }
                if (t[i + 2] == 0) {
                    temp = temp + a[i + 2];
                }
                if (temp > sum) {
                    sum = temp;
                    index = i;
                }
            }
        }
        for (int i = index; i < index + 3; i++) {
            t[i] = 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                res = res + a[i];
            }
        }
        System.out.println(res);
    }
}
