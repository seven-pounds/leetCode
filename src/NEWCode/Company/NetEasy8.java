package NEWCode.Company;

import java.util.Scanner;

public class NetEasy8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            m[i] = sc.nextInt();
        }
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = h[i];
            b[i] = m[i];
        }

        int x = sc.nextInt();
        int classHour = sc.nextInt();
        int clssMi = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int temph = x / 60;
            int tempm = x % 60;
            h[i] = h[i] + temph;
            if (m[i] + tempm >= 60) {
                h[i] = h[i] + 1;
                m[i] = (m[i] + tempm) % 60;
            } else {
                m[i] = m[i] + tempm;
            }
        }
        int index = 0;
        int maxh = 0;
        int maxm = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] > classHour) continue;

            if (h[i] < classHour) {//小时小于，一定可以
                if (h[i] > maxh) {//记录中小时最大小于当前值
                    maxh = h[i];
                    index = i;
                }
                if (h[i] == maxh) {
                    if (m[i] > m[index]) {
                        index = i;
                    }
                }

            } else {//小时相等，判断分钟
                if (h[i] >= maxh) maxh = h[i];
                if (m[i] <= clssMi) {
                    if (m[i] >= maxm) {
                        maxm = m[i];
                        index = i;
                    }
                }
            }
        }

        System.out.println(a[index] + " " + b[index]);
    }
}
