package LeetCode.LinkTable5;

public class Num92_1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(n<=1&&m==n) return head;
        ListNode pre=new ListNode(-1);
        pre.next=head;
        ListNode begin=head;
        ListNode end=head;
        ListNode endNext=head;
        while (m>1){
            pre=pre.next;
            begin=begin.next;
            m--;n--;
        }
        end=begin;
        while (n>1){
            end=end.next;
            n--;
        }
        endNext=end.next;
        end.next=null;
        begin=reverse(begin);
        pre.next=begin;
        while (begin.next!=null){
            begin=begin.next;
        }
        begin.next=endNext;
        return head;

    }
    public ListNode reverse(ListNode node){
        ListNode pre=null;
        ListNode next=null;
        while(node!=null){
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }
}
