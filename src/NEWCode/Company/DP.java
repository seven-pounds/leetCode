package NEWCode.Company;

import org.junit.Test;

/**
 * Create by jingzfan on 2019/3/26.
 */
public class DP {
    @Test
    public void DPSelectCoinTest() {//选择最少组合次数
        int[] a = {1, 3, 5};
        int sum = 17;
        int dp[] = new int[sum + 1];
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) dp[i] = i;
        for (int i = 1; i <= sum; i++) {
            int temp = 1000;
            for (int j = 0; j < 3; j++) {
                if (i >= a[j]) {
                    if (dp[i - a[j]] + 1 < temp) {
                        temp = dp[i - a[j]] + 1;
                    }

                }
            }
            dp[i] = temp;
        }
        System.out.println(dp[sum]);
    }

    @Test
    public void DPLCSTest() {//

    }

    //最大组数之和
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) return 0;
        int result = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            result = Math.max(max, result);
        }
        return result;
    }

    @Test
    public void FindGreatestSumOfSubArray1() {
        int[] array = {-7, -2, -3, -4, -5};
        if (array.length == 0 || array == null) {
            return;
        }
        int curSum = 0;
        int greatestSum = 0x80000000;
        for (int i = 0; i < array.length; i++) {
            if (curSum <= 0) {
                curSum = array[i]; //记录当前最大值
            } else {
                curSum += array[i]; //当array[i]为正数时，加上之前的最大值并更新最大值。
            }
            if (curSum > greatestSum) {
                greatestSum = curSum;
            }
        }
        System.out.println(greatestSum);

    }

    //找最大回文子串，方法一，中心扩展法
    public String longestPalindrome1(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = expan(s, i, i);
            int l2 = expan(s, i, i + 1);
            int len = Math.max(l1, l2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end);
    }

    public int expan(String s, int left, int right) {
        char[] ch = s.toCharArray();
        while (left >= 0 && right < ch.length && ch[left] == ch[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    //找最大回文子串，方法2，动态规划
    public String longestPalindrome2(String s) {
        return s;
    }

}
