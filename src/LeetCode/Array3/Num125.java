package LeetCode.Array3;

public class Num125 {
    public static void main(String[] args) {
        String s = "race a ca";
        System.out.println(isPalindrome(s));
        System.out.println(ischarater('f'));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!ischarater(chars[i])) i++;
            if (!ischarater(chars[j])) j--;
            if (ischarater(chars[i]) && ischarater(chars[j])) {
                if (!isEquals(chars[i], chars[j])) return false;
                i++;
                j--;
            }
        }
        return true;
    }

    public static boolean ischarater(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }

    public static boolean isEquals(char a, char b) {
        if (a < 'A' || b < 'A') {
            if (a == b) return true;
        } else {
            if (a == b || a - b == 32 || b - a == 32) return true;
        }
        return false;
    }
}
