package NEWCode.Company;

public class CouldWalk2 {
    public static void main(String[] args) {
        System.out.println(reverse("babac"));
    }

    public static int reverse(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int len = 0;
            int len1 = expandAround(str, i, i);
            int len2 = expandAround(str, i, i + 1);
            len = Math.max(len1, len2);
            max = Math.max(max, len);
        }
        return max;
    }

    public static int expandAround(String str, int start, int end) {
        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
