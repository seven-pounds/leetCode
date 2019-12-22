package LeetCode.StackAndQueue6;

import java.util.Stack;

public class Num20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[[](])"));
    }

    public static boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                stack.push('(');
            }
            if (ch[i] == '[') {
                stack.push('[');
            }
            if (ch[i] == '{') {
                stack.push('{');
            }
            if (ch[i] == ')') {
                if (stack.isEmpty() || '(' != (char) stack.pop()) {
                    return false;
                }
            }
            if (ch[i] == ']') {
                if (stack.isEmpty() || '[' != (char) stack.pop()) {
                    return false;
                }
            }
            if (ch[i] == '}') {
                if (stack.isEmpty() || '{' != (char) stack.pop()) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

}
