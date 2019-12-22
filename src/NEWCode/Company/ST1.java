package NEWCode.Company;

import java.util.Scanner;
import java.util.Stack;

public class ST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int num1 = 0;
        int num2 = 0;
        while (sc.hasNext()) {
            String str = sc.next();
            switch (str) {
                case "-":
                    num1 = Integer.valueOf((String) stack.pop());
                    num2 = Integer.valueOf((String) stack.pop());
                    stack.push(num2 - num1);
                case "+":

                    num1 = Integer.valueOf((String) stack.pop());
                    num2 = Integer.valueOf((String) stack.pop());
                    stack.push(num2 + num1);
                case "*":
                    num1 = Integer.valueOf((String) stack.pop());
                    num2 = Integer.valueOf((String) stack.pop());
                    stack.push(num2 * num1);
                case "/":
                    num1 = Integer.valueOf((String) stack.pop());
                    num2 = Integer.valueOf((String) stack.pop());
                    stack.push(num2 / num1);
                default:
                    stack.push(str);
            }

            System.out.println(stack.peek());

        }
    }
}
