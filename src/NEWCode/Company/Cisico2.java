package NEWCode.Company;

public class Cisico2 {
    public static int longestPalindrome(int n, String s) {
        // Write your code here
        return longestPalindrome(s).length();

    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;int max=0;int index=0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > max) {
                max=len;
                index=i;

            }
        }
        return s.substring(index-(max-1)/2, index+max/2 + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
