package LeetCode.LinkTable5;

public class Num25_1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        ListNode next=head.next;
        return curr;

    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        while(head!=null){
            head=head.next;
            curr.next=pre;
            pre=curr;
            curr=head;
        }
        return pre;
    }
}
