package LeetCode.Array3;

public class Num283 {

    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != 0) {
                i++;
                j++;
            } else {
                break;
            }
        }
        j++;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
                continue;
            }
            nums[i] = nums[j];
            i++;
            j++;
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

}
