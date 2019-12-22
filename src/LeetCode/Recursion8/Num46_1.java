package LeetCode.Recursion8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Num46_1 {
    // 1,2,3
    //       1,2,3
    //       /      |      \
    //      2       2       2
    //    / | \   / | \    / | \
    //   3
    static List<List<Integer>> res = new LinkedList();

    public static void main(String[] args) {
        int[] nums={1,2,3};
        permute(nums);
    }
    public  static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<Integer> list=new LinkedList<>();
        backtrack(list, nums, 0);
        System.out.println(res);
        return res;
    }

    public  static void backtrack( List<Integer> list, int[] nums, int first) {
        if(list.size()==nums.length) res.add(new ArrayList<>(list));
        for (int i = first; i <nums.length ; i++) {
            swap(nums,first,i);
            backtrack(list,nums,i+1);
            swap(nums,i,first);
        }
    }

    private static void swap(int[] nums, int first, int i) {
        int temp =nums[first];
        nums[first]=nums[i];
        nums[i]=temp;
    }

}
