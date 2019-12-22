package LeetCode.Recursion8;

import java.util.ArrayList;
import java.util.List;

public class Num77 {
    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        combine(4, 2);
    }

    public static List<List<Integer>> combine(int n, int k) {

        if (n <= 0 || k <= 0 || k > n) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        process(n, k, 1, list);

        return lists;

    }


    private static void process(int n, int k, int start, List<Integer> list) {
        //递归的终止条件
        if (list.size() == k) {
            lists.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = start; i <= n - (k - list.size()) + 1; i++) {
                list.add(i);

                process(n, k, i + 1, list);
                list.remove(list.size() - 1);
            }
        }

    }
}
