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

    // 2.5
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int carrier = 0; a != null || b != null || carrier != 0; cur = cur.next, carrier /= 10) {
            if (a != null) {
                carrier += a.val;
                a = a.next;
            }
            if (b != null) {
                carrier += b.val;
                b = b.next;
            }
            cur.next = new ListNode(sum % 10);
        }
        return dummy.next;
    }

    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carrier = 0;
        while (a != null || b != null || carrier != 0) {
            int sum = carrier;
            if (a != null) {
                sum += a.val;
                a = a.next;
            }
            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carrier = sum / 10;
        }
        return dummy.next;
    }

    // 2.7
    public boolean isPalindrome(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return true;
        }
        ListNode cur1 = pHead;
        ListNode cur2 = pHead.next;
        while (cur2 != null && cur2.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
        cur2 = reverse(cur1.next);
        cur1 = pHead;
        while (cur2 != null && cur1.val == cur2.val) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur2 == null;
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
        }
        return head;
    }

}
