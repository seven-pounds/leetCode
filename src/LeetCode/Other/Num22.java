package LeetCode.Other;

import java.util.ArrayList;
import java.util.List;

public class Num22 {
    public static void main(String[] args) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, 2);

    }

    public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            System.out.println(cur

            );
            return;
        }

        if (open < max)
            backtrack(ans, cur + "(", open + 1, close, max);
        if (close < open)
            backtrack(ans, cur + ")", open, close + 1, max);
    }

}
