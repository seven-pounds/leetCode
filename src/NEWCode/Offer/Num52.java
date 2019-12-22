package NEWCode.Offer;

public class Num52 {
    public static void main(String[] args) {
        String s = "aaa";
        String pattern = "aa.a";
        System.out.println(match(s.toCharArray(), pattern.toCharArray()));
    }

    public static boolean match(char[] str, char[] pattern) {
        int i = 0;
        int j = 0;
        while (i < str.length && j < pattern.length) {
            if (str[i] == pattern[j] || pattern[j] == '.') {
                i++;
                j++;
            } else {
                j++;
            }
            if (i == str.length && j == pattern.length) return true;
            if (pattern[j] == '*') {
                if (pattern[j + 1] == str[i]) {
                    j++;
                }
            }
        }

        return false;

    }
}
