package LeetCode.Recursion8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Num40_1 {
   static List<List<Integer>> res=new LinkedList<>();

    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        List<List<Integer>> test=combinationSum2(arr,8);
        for (List ele:test) {
            for (Object key:ele) {
                System.out.print(key+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return res;
        }
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        backtrack(list,candidates,target,0);
        return res;
    }
    public static void backtrack(List<Integer> list,int[] candidates, int target,int pos){
        if(target==0) {
            if(res.contains(list)) return;
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;
        for (int i = pos; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(list,candidates,target-candidates[i],i+1);
            list.remove(list.size()-1);

        }

    }
}
