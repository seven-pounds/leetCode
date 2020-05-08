package LeetCode.Tree7;

import LeetCode.LinkTable5.ListNode;

public class Num109 {

    public TreeNode helper(ListNode head){
        TreeNode root=new TreeNode(head.val);
        ListNode mid=finfMid(head);
        ListNode rightHead=mid.next;
        root.left=helper(head);
        root.right=helper(rightHead);
        return root;
    }
    public ListNode finfMid(ListNode head){
        ListNode mid=head;
        while (head!=null&&head.next!=null){
            mid=mid.next;
            head=head.next.next;
        }
        return mid;
    }
}
