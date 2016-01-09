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
        while (cur != null && k < n) {
            if (k >= m) {
                prev.next = cur.next;
                cur.next = head;
                head = cur;
                cur = prev.next;
            }
            prev = prev.next;
            cur = prev.next;
            k++;
        }
        return dummy.next;
    }

}
