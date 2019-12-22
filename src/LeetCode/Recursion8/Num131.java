package LeetCode.Recursion8;

import java.util.ArrayList;
import java.util.List;

public class Num131 {
//    aabb
//    先考虑在第 1 个位置切割，a | abb
//    把 a 加入到结果中 [a]
//
//    然后考虑 abb
//    先考虑在第 1 个位置切割，a | bb
//    把 a  加入到结果中 [a a]
//
//    然后考虑 bb
//    先考虑在第 1 个位置切割，b | b
//    把 b 加入到结果中 [a a b]
//
//    然后考虑 b
//    先考虑在第 1 个位置切割，b |
//    把 b 加入到结果中 [a a b b]
//
//    然后考虑空串 把结果加到最终结果中 [[a a b b]]
//
//    回溯到上一层
//    考虑 bb
//    考虑在第 2 个位置切割，bb |
//    把 bb 加入到结果中 [a a bb]
//    然后考虑 空串
//    把结果加到最终结果中 [[a a b b] [a a bb]]
//    然后继续回溯

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, s, new ArrayList<String>());
        return res;

    }

    private void backtrack(List<List<String>> res, String s, ArrayList<String> tmp) {
        if (s == null || s.length() == 0) res.add(new ArrayList<>(tmp));
        for (int i = 1; i <= s.length(); i++) {
            if (isPalidrome(s.substring(0, i))) {
                // System.out.println(s.substring(0, i));
                tmp.add(s.substring(0, i));
                backtrack(res, s.substring(i, s.length()), tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    private static boolean isPalidrome(String sb) {
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}
