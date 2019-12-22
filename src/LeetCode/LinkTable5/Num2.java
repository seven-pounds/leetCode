package LeetCode.LinkTable5;

public class Num2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int temp = 0;
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            if (x + y + flag > 9) {
                temp = (x + y + flag) % 10;
                curr.next = new ListNode(temp);
                flag = (x + y + flag) / 10;
            } else {

                curr.next = new ListNode(x + y + flag);
                flag = (x + y + flag) / 10;
            }
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (flag != 0) curr.next = new ListNode(flag);
        return result.next;
    }
}
