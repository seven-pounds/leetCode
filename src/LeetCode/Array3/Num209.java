package LeetCode.Array3;

public class Num209 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
//        System.out.println(minSubArrayLen(7, nums));
        System.out.println(test1(7, nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int l = 0;
        int res = nums.length + 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= s) {
                res = Math.min(res, i - l + 1);
                sum = sum - nums[l];
                l++;
            }
        }
        if (res == nums.length + 1) return 0;
        return res;
    }

    public static int test1(int s, int[] nums){
        int res=nums.length;
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<=s){

                continue;

            }
            while(sum>s){
                res=Math.min(res,i-left);
                sum=sum-nums[left];
                left++;
            }

        }
        return res;
    }
}
