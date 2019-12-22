package NEWCode.Company;

import java.util.Scanner;

public class SIP {
    public static void main(String[] args) {
        //"%22Cisco%22"<sip:10000@172.16.130.42>
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("<");
        str = arr[0];
        int len = str.length();
        if (str.charAt(len - 1) == '"') {
            if (str.charAt(len - 2) == '2') {
                System.out.println(str.substring(4, len - 4));
            } else {
                System.out.println(str.substring(1, len - 1));
            }
        } else {
            if (str.charAt(len - 2) == '2') {
                System.out.println(str.substring(4, len - 3));
            } else {
                System.out.println(str.substring(1, len));
            }
        }
    }

}
