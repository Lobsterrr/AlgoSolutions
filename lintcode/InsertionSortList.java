/*
 * Sort a linked list using insertion sort.

Example
Given 1->3->2->0->null, return 0->1->2->3->null.
 */
/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class InsertionSortList {

    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            ListNode prev = dummy;
            ListNode curr = prev.next;
            while (curr != null && curr.val <= cur.val) {
                curr = curr.next;
                prev = prev.next;
            }
            prev.next = cur;
            cur.next = curr;
        }
        return dummy.next;
    }

}
