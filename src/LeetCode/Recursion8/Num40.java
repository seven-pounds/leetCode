package LeetCode.Recursion8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num40 {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return lists;
        }
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        process(0, candidates, target, list);
        return lists;
    }


    private void process(int start, int[] candidates, int target, List<Integer> list) {
        //递归的终止条件
        if (target < 0) {
            return;
        }
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                //因为每个数字都可以使用无数次，所以递归还可以从当前元素开始
                process(start + 1, candidates, target - candidates[i], list);
                list.remove(list.size() - 1);
            }
        }

    }
}
