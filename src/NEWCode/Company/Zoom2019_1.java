package NEWCode.Company;

import java.util.Scanner;

public class Zoom2019_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] - '0');
            if (arr[i] == '-' || (arr[i] - '0' > 0 && arr[i] - '0' < 9)) {
                if (arr[i] == '-') {
                    count++;
                    continue;
                }
                if (count % 2 == 0) {
                    res = res + (arr[i] - '0');
                    System.out.println("-----" + res);
                } else {
                    res = res - (arr[i] - '0');
                    System.out.println("-----" + res);
                }
            } else {
                count = 0;
                continue;
            }


        }
        System.out.println(res);
    }
}
