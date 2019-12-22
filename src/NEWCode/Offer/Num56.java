package NEWCode.Offer;

public class Num56 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
//        ListNode node7=new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
//        node6.next=node7;
        ListNode head = deleteDuplication(node1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode fir = pHead;
        ListNode sec = pHead.next;
        while (sec != null) {
            if (sec.val != fir.val) {
                fir.next = sec;
                fir = fir.next;
                sec = sec.next;
            } else {
                if (sec.next == null) {
                    fir.next = null;
                }
                sec = sec.next;
            }
        }
        return pHead;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
