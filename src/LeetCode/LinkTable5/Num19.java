package LeetCode.LinkTable5;

public class Num19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = cur.next;
        return head;
    }
}
