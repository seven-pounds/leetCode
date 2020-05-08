package LeetCode.StackAndQueue6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num144 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        TreeNode curr=null;
        stack.push(root);
        while(!stack.isEmpty()){
            curr=stack.pop();
            list.add(curr.val);
            if(curr.right!=null) stack.push(curr.right);
            if(curr.left!=null) stack.push(curr.left);
        }
        return list;
    }
}
