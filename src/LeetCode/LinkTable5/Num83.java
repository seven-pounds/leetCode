package LeetCode.LinkTable5;

public class Num83 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        deleteDuplicates(n1);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode next = cur.next;
        while (next != null) {
            while (cur.val == next.val) {
                next = next.next;
                if (next == null) {
                    cur.next = null;
                    return head;
                }
            }
            if (cur.next != next) {
                cur.next = next;
            } else {
                cur = cur.next;
                next = next.next;
            }
        }

        return head;
    }
}
