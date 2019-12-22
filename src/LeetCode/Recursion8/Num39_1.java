package LeetCode.Recursion8;

import java.util.LinkedList;
import java.util.List;

public class Num39_1 {
    List<List<Integer>> res= new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> list=new LinkedList<>();
        backtrack(list,candidates,target);
        return res;
    }
    public void backtrack(LinkedList<Integer> list,int[] candidates, int target){
        if(target==0) res.add(list);
        if(target<0) return;
        for (int i = 0; i < candidates.length; i++) {//会出现重复现象
            list.add(candidates[i]);
            backtrack(list,candidates,target-candidates[i]);
            list.removeLast();
        }
    }
}
