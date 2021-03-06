package LeetCode.Tree7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num94 {
    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        inorderTraversal(root);
    }
    public static List< Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
