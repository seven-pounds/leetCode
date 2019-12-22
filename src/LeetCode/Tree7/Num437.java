package LeetCode.Tree7;

public class Num437 {
    public static int pathSum(TreeNode root, int sum) {

        if (root == null) return 0;
        return pathSum(root.right, sum) + pathSum(root.left, sum) + helper(root, sum);
    }

    public static int helper(TreeNode root, int sum) {
        if (root == null) return 0;
        int res = 0;
        if (root.val == sum) res += 1;
        return res += helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
    }
}
