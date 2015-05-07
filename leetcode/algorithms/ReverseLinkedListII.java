/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,

 * return 1->4->3->2->5->NULL.

 * Note:
 * Given m, n satisfy the following condition:
 * 1 <= m <= n <= length of list.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class ReverseLinkedListII {
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode middle;
        ListNode tail;
        for (; cur.next != null && n > 0; cur = cur.next, n--);
        tail = cur.next;
        cur.next = null;
        cur = dummy;
        for (; cur.next != null && m > 0; cur = cur.next, m--);
        middle = cur.next;
        cur.next = null;
        reverse(middle);
        cur.next = middle;
        for (cur = dummy; cur.next != null; cur = cur.next);
        cur.next = tail;
        return dummy.next;
    }

    public void reverse(ListNode head) {
        if (head == null)
            return;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = head;
            head = cur;
            cur = pre.next;
        }
    }










    public ListNode reverseBetween(ListNode head, int m, int n) {
        for(int i = 0; i <= (n - m) / 2; i++) {
            int curM = m + i;
            int curN = n - i;
            ListNode mNode = head;
            ListNode nNode = head;
            while(curM - 1 > 0) {
                mNode = mNode.next;
                curM--;
            }
            while(curN - 1 > 0) {
                nNode = nNode.next;
                curN--;
            }
            int temp = mNode.val;
            mNode.val = nNode.val;
            nNode.val = temp;
        }
        return head;
    }

/*****************************************************************************/

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n)
            return head;
        ListNode prev = null, current = head, next = null;
        for(int i = 0; i < m - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode low = prev, high = current;
        prev = current;
        current = current.next;
        for(int i = m; i < n; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(high != null)
            high.next = current;
        if(low != null)
            low.next = prev;
        else
            head = prev;
        return head;
    }

/***************************** updated 2014.01.24 ****************************/

    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = head.next;
        head.next = null;
        while(p != null) {
            ListNode q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curM = dummy;
        ListNode curN = dummy;
        while(n > 0) {
            curN = curN.next;
            n--;
            if(n < m - 1) {
                curM = curM.next;
                m--;
            }
        }
        ListNode mid = curM.next;
        curM.next = null;
        ListNode right = curN.next;
        curN.next = null;
        curM.next = reverse(mid);
        if(right != null) {
            while(curM.next != null) {
                curM = curM.next;
            }   
            curM.next = right;
        }   
        return dummy.next;
    }
}
