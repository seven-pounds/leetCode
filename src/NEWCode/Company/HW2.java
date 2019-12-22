package NEWCode.Company;

import java.util.Scanner;
import java.util.Stack;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a,,1,"b,""",c
        String str = sc.next();
        int len = str.length();
        int count = 0;
        Stack stack = new Stack();
        int left = 0;
        int right = 0;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ',') {
                if (str.charAt(i) == '"') {
                    left = i;
                    if (str.charAt(i + 1) == '"') {


                    }
                    stack.push(str.charAt(i));
                }
                System.out.println(str.charAt(i));
            } else {
                if (str.charAt(i + 1) == ',') {
                    System.out.println("--");
                    count++;
                }
            }
        }
    }
}
