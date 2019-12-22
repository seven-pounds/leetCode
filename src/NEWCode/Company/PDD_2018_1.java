package NEWCode.Company;

import java.util.Arrays;
import java.util.Scanner;

public class PDD_2018_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);


        int res1 = a[0] * a[1] * a[n - 1];
        int res2 = a[n - 1] * a[n - 2] * a[n - 3];
        if (res1 >= res2) System.out.println(res1);
        if (res1 < res2) System.out.println(res2);
    }
}
