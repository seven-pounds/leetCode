package NEWCode.Company;

import java.util.Scanner;

public class Ctrip_1 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static ListNode partition(ListNode head, int m) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode next = head.next;
        ListNode cur = head;
        while (next != null) {
            if (cur.val > m) {
                cur = cur.next;
                next = next.next;
                pre = pre.next;
            } else {
                cur.next = head;
                pre.next = next;
                head = cur;
                cur = next;
                next = next.next;
            }
        }
        if (cur.val < m) {
            pre.next = null;
            cur.next = head;
            head = cur;
        }
        ListNode end = head;
        ListNode nullPiont = null;
        while (end.val < m) {
            nullPiont = end;
            end = end.next;
        }
        nullPiont.next = null;
        head = revserse(head);
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = end;
        return head;
    }

    static ListNode revserse(ListNode head) {
        if (head == null) return head;
        ListNode next = null;
        ListNode pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode head = partition(l1, 5);
        if (head != null) {
            System.out.print(head.val);
            head = head.next;
            while (head != null) {
                System.out.print(",");
                System.out.print(head.val);
                head = head.next;
            }
        }

    }
}

