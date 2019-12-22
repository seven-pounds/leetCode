package NEWCode.Company;

import java.util.Scanner;

public class NetEasy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j >= k) {
                    count++;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.print(count);
    }
}
