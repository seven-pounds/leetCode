package NEWCode.Company;

import java.util.Scanner;

public class NetEasy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] n = new int[t];
        String[] s = new String[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            s[i] = sc.next();
        }

        for (int i = 0; i < t; i++) {
            int count = 0;
            for (int j = 0; j < n[i]; j++) {
                if (s[i].charAt(j) == '.') {
                    j += 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
