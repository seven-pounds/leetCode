package LeetCode.Tree7;

public class Num111 {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
