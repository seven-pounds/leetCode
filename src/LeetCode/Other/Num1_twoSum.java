package LeetCode.Other;

import java.util.HashMap;
import java.util.Map;

public class Num1_twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 2, 15};
        twoSum(nums, 4);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = (int) map.get(target - nums[i]);
                System.out.println(res[0]);
                res[1] = i;

                System.out.println(res[1]);
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
