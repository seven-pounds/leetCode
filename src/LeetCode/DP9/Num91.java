package LeetCode.DP9;

import java.util.Arrays;

public class Num91 {
    int[] memo;

    public int numDecodings(String s) {
        memo = new int[s.length() + 1];
        Arrays.fill(memo, -1);
        return getAns(s, 0);
    }

    public int getAns(String s, int num) {

        if (num == s.length()) {
            return 1;
        }
        if (s.charAt(num) == '0') {
            return 0;
        }
        if (memo[num] > -1) {
            return memo[num];
        }
        int ans1 = getAns(s, num + 1);


        int ans2 = 0;
        if (num < s.length() - 1) {
            // 判断前两个数字是否  >26？
            if ((s.charAt(num) - '0') * 10 + (s.charAt(num + 1) - '0') <= 26) {
                ans2 = getAns(s, num + 2);
            }
        }

        memo[num] = ans1 + ans2;
        return memo[num];
    }
}
