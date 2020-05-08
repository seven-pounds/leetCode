package LeetCode.Tree7;

public class Num98 {
    public static void main(String[] args) {
        TreeNode root =new TreeNode(10);
        root.right=new TreeNode(15);
        root.left=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(20);
        isValidBST(root);
    }
    public static boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return isValid(root);
    }
    public static boolean isValid(TreeNode node){
        if(node==null) return true;
        if(node.left!=null && node.left.val>=node.val) return false;
        if(node.right!=null && node.right.val<=node.val) return false;
        boolean b1=isValid(node.left);
        boolean b2=isValid(node.right);
        return isValid(node.left)&&isValid(node.right);
    }
}
