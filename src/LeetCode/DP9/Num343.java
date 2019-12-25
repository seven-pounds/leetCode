package LeetCode.DP9;

public class Num343 {
    //暴力解法
    public int integerBreak1(int n) {
        if (n == 2) {
            return 1;
        }
        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            res = Math.max(res, Math.max(i * (n - i), i * integerBreak1(n - i)));
        }
        return res;
    }
    // 记忆化搜索-自顶向下
    int[] memory;
    public int integerBreak(int n) {
        memory = new int[n + 1];
        return integerBreakHelper(n);
    }
    public int integerBreakHelper(int n) {
        if (n == 2) {
            return 1;
        }
        // 记忆化的核心
        if (memory[n] != 0) {
            // memory的初始值为0，如果它不为0，说明已经计算过了，直接返回即可
            return memory[n];
        }
        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            res = Math.max(res, Math.max(i * integerBreakHelper(n - i), i * (n - i)));
        }
        memory[n] = res;
        return res;
    }
}
