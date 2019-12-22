package LeetCode.DP9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Num120 {
    static int row;
    static Integer[][] memo;

    public static void main(String[] args) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        lists.add(list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        lists.add(list2);
        minimumTotal(lists);

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        row = triangle.size();
        memo = new Integer[row][row];
        return helper(0,0, triangle);
    }
    private static int helper(int level, int c, List<List<Integer>> triangle){
        // System.out.println("helper: level="+ level+ " c=" + c);
        if (memo[level][c]!=null)
            return memo[level][c];
        if (level==row-1){
            return memo[level][c] = triangle.get(level).get(c);
        }
        int left = helper(level+1, c, triangle);
        int right = helper(level+1, c+1, triangle);
        return memo[level][c] = Math.min(left, right) + triangle.get(level).get(c);
    }
}
