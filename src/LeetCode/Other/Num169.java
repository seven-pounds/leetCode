package LeetCode.Other;

public class Num169 {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,2};
        majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=nums[0];
        for (int num: nums) {
            if(count==0) candidate=num;
            if(candidate==num){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
