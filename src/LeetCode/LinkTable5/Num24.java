package LeetCode.LinkTable5;

public class Num24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dum = new ListNode(0);
        ListNode p = dum;
        p.next = head;
        while (head != null && head.next != null) {
            ListNode node1 = head;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            node2.next = node1;
            node1.next = next;
            p.next = node2;
            p = node1;
            head = next;
        }
        return dum.next;

    }
}
