package LeetCode.DP9;

public class Num198 {
    //考虑 f(0)=max(nums[0]+f(2),nums(1)+f(3),nums[2]+f(4),,,nuns[n-1],nums[n]
    //[1,2,3,1]
    //[2,7,9,3,1]
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[len];
    }
}
