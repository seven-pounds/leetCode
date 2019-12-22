package CIG.Chapter1_StackAndQueue;

import java.util.Stack;

public class Num3_ReverseStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int last = getLastAndRemove(stack);
        reverse(stack);
        stack.push(last);
    }

    private static int getLastAndRemove(Stack<Integer> stack) {
        int res = stack.pop();
        if (stack.isEmpty()) {
            return res;
        } else {
            int last = getLastAndRemove(stack);
            stack.push(last);
            return res;
        }

    }
}
