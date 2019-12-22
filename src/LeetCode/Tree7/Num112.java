package LeetCode.Tree7;

public class Num112 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if ((root.left == null) && (root.right == null) && (root.val == sum)) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//        if (root == null)
//            return false;
//
//        sum -= root.val;
//        if ((root.left == null) && (root.right == null))
//            return (sum == 0);
//        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);


    }
}
