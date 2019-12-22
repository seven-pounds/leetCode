package NEWCode.Company;

import java.util.Scanner;

public class NetEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(str);
        int lcount = 0;
        int rcount = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'L') {
                lcount++;
            } else {
                rcount++;
            }
        }
        if (lcount > rcount) {
            count = lcount - rcount;
        } else {
            count = rcount - lcount;
        }
        switch (count % 4) {
            case 0:
                System.out.print("N");
                break;
            case 4:
                System.out.print("N");
                break;
            case 1:
                System.out.print("E");
                break;
            case 2:
                System.out.print("S");
                break;
            case 3:
                System.out.print("W");
                break;

        }
    }
}
