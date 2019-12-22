package LeetCode.Tree7;

public class Num110 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 3, null, null, 4, 4};
        TreeNode root = TreeUtil.arrayToTree(arr, 0);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = TreeUtil.getTreeDepth(root.left);
        int right = TreeUtil.getTreeDepth(root.right);
        if (left - right > 1 || right - left > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
