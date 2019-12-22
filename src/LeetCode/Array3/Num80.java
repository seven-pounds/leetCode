package LeetCode.Array3;

public class Num80 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 4, 5, 5, 6, 6, 7};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int i = 1;
        int j = 2;
        while (j < nums.length) {
            if (nums[i - 1] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
