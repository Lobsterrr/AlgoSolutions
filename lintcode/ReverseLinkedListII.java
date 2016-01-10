/*
 * Reverse a linked list from position m to n.

Example
Given 1->2->3->4->5->NULL, m = 2 and n = 4, return 1->4->3->2->5->NULL.

Note
Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.

Challenge
Reverse it in-place and in one-pass
 */
/**
 * Definition for ListNode
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

    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = prev.next;
        int k = 1;
        ListNode head2 = dummy;
        while (cur != null && k <= n) {
            if (k == m - 1) {
                head2 = cur;
            }
            if (k <= m) {
                prev = prev.next;
                cur = prev.next;
            } else {
                prev.next = cur.next;
                cur.next = head2.next;
                head2.next = cur;
                cur = prev.next;
            }
            k++;
        }
        return dummy.next;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i < m; ++i) {
            prev = prev.next;
        }
        ListNode head2 = prev;
        prev = prev.next;
        ListNode cur = prev.next;
        for (int i = m; i < n; ++i) {
            prev.next = cur.next;
            cur.next = head2.next;
            head2.next = cur;
            cur = prev.next;
        }
        return dummy.next;
    }

}
