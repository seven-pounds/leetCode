package LeetCode.StackAndQueue6;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List< Integer > inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack();
        List< Integer > list=new ArrayList<>();
        TreeNode cur=root;
        stack.push(root);
        while (!stack.isEmpty()){
            while (cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
            cur = stack.pop();
            list.add(cur.val);
            if(cur.right!=null){
                cur=cur.right;
                stack.push(cur);
            }

        }
        return list;
    }
}

