package LeetCode.Other;

import java.util.Stack;

public class Num20 {
    //括号配对
    public static boolean isValid(String str) {
        char[] ch = str.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                stack.push(ch[i]);
                continue;
            }
            if (stack.isEmpty()) return false;
            if (ch[i] == ')' && (char) stack.pop() != '(') return false;
            if (ch[i] == ']' && (char) stack.pop() != '[') return false;
            if (ch[i] == '}' && (char) stack.pop() != '{') return false;
        }
        if (!stack.isEmpty()) return false;
        return true;

    }

    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));
    }
}
