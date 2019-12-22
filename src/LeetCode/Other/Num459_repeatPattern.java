package LeetCode.Other;

public class Num459_repeatPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int i = 0;
        int t = 0;
        char[] ch = s.toCharArray();
        for (t = 1; t <= len / 2; ++t) {
            if (len % t != 0) continue;
            for (i = t; i < len && ch[i % t] == ch[i]; ++i) ;
            if (i == len) {
                System.out.println(t);
                return true;
            }

        }
        System.out.println(t);
        return false;

    }
}
