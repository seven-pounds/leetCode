package CIG.Chapter1_StackAndQueue;

import java.util.Stack;

public class NUM5_SortStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(8);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void sort(Stack stack) {
        Stack help = new Stack();
        while (!stack.isEmpty()) {
            int cur = (int) stack.pop();
            while (!help.isEmpty() && (int) help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
