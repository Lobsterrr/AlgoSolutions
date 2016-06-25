import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Chapter2 {

    // 2.2
    public ListNode FindKthToTail(ListNode head, int k) {
        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next, len++);
        if (k > len) {
            return null;
        }
        ListNode cur = head;
        int step = 1;
        for (ListNode pNode = head; pNode != null; pNode = pNode.next, step++) {
            if (step > k) {
                cur = cur.next;
            }
        }
        return cur;
    }

    // 2.3
    public boolean removeNode(ListNode pNode) {
        if (pNode == null || pNode.next == null) {
            pNode = null;
            return false;
        } else {
            pNode.val = pNode.next.val;
            pNode.next = pNode.next.next;
            return true;
        }
    }

    // 2.7
    public boolean isPalindrome(ListNode pHead) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        while (cur2 != null && cur2.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }

    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        while (prev.next != null) {
            ListNode cur = prev.next;
            prev.next = cur.next;
            cur.next = head;
            head = cur;
            prev = prev.next;
        }
        return head;
    }

}
