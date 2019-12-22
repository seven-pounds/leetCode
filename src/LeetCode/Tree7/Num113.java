package LeetCode.Tree7;

import java.util.ArrayList;
import java.util.List;

public class Num113 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, sum, ans, new ArrayList<>());
        return ans;
    }

    private static void helper(TreeNode node, int sum, List<List<Integer>> ans, List<Integer> path) {
        if (node == null) {
            return;
        }
        // 将沿途到节点加入到path中
        sum -= node.val;
        path.add(node.val);
        // 遍历到叶节点
        if (node.left == null && node.right == null) {
            // 如果这是一条可行的路径，才复制path的结果到ans
            if (sum == 0)
                ans.add(new ArrayList<>(path));
        } else {
            helper(node.left, sum, ans, path);
            helper(node.right, sum, ans, path);
        }
        // 回溯
//        path.remove(path.size() - 1);
    }


}
