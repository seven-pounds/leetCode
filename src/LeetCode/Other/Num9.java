package LeetCode.Other;

public class Num9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        int res = 0;
        int n = x;
        if (x < 0) return false;
        while (x > 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (res == n) return true;
        return false;
    }
}
