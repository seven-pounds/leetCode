package LeetCode.Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};//-4 -1 -1 0 1 2
        sum(num, 0);
    }

    public static List<List<Integer>> sum(int[] nums, int target) {
        Arrays.sort(nums);
        int k = 0;
        List<List<Integer>> res = new ArrayList();
        while (k < nums.length) {
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;

            while (i < j) {
                if (nums[k] + nums[i] + nums[j] == 0) {
                    List<Integer> list = new ArrayList();
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    res.add(list);
                    i++;
                    j--;
                }
                if (nums[k] + nums[i] + nums[j] > 0) j--;
                if (nums[k] + nums[i] + nums[j] < 0) i++;
            }

            k++;
        }
        return res;
    }
}
