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
        ListNode cur1 = head;
        ListNode cur2 = head;
        int step = 0;
        while (cur1 != null) {
            cur1 = cur1.next;
            step++;
            if (step > len - k) {
                cur2 = cur2.next;
            }
        }
        return cur2;
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

}
