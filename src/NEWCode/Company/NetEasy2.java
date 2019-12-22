package NEWCode.Company;

import java.util.Scanner;

public class NetEasy2 {
    public static void main(String[] args) {
        fun1();
    }

    public static void fun1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] num = new int[n];
        int[] campare = new int[q];
        int[] res = new int[q];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            campare[i] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (num[j] >= campare[i]) {
                    num[j] = num[j] - 1;
                    count++;
                }
            }
            res[i] = count;
        }

        for (int i = 0; i < q; i++) {
            System.out.println(res[i]);
        }

    }
}
