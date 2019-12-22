package LeetCode.Array3;

public class Num27 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 2, 2, 3, 4};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        if (nums.length == 0) return 0;
        while (i < j) {
            if (nums[i] != val) {
                i++;
                continue;
            }
            if (nums[j] == val) {
                j--;
                continue;
            }
            nums[i] = nums[j];
            i++;
            j--;
        }
        if (nums[i] == val) {
            return j;
        } else {
            return j + 1;
        }
    }
}

