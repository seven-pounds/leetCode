package NEWCode.Company;

import java.util.Scanner;

public class PDD_2018_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(ch1[0] + ch2[0]);
        String res = "";
        if (str1.length() > str2.length()) {
            int len = str1.length() - str2.length();
            for (int i = str1.length() - 1; i >= 0; i--) {
                int temp = str1.charAt(i) * str1.charAt(i - len);
            }
        }
    }
}
