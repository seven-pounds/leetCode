package LeetCode.Other;

public class Num27 {
    public static void main(String[] args) {
        int[] num = {2, 2, 2, 2};
        System.out.println(removeElement(num, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        int i = 0;
        boolean flag = true;
        while (j < nums.length) {
            if (nums[i] != val && flag) {
                i++;
                j++;
                continue;
            } else {
                flag = false;
            }

            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                j++;
            } else {
                j++;
            }

        }
        if (flag) return i + 1;
        return i;
    }
}
