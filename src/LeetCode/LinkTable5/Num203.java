package LeetCode.LinkTable5;

public class Num203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode dumpy = new ListNode(-1);
        dumpy.next = head;
        ListNode pre = dumpy;
        ListNode reHead = dumpy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }

        }
        return dumpy.next;
    }
}
