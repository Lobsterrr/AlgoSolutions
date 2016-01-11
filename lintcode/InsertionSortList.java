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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode toInsert = head.next;
        head.next = null;
        while (toInsert != null) {
            ListNode prev = dummy;
            ListNode cur = prev.next;
            while (cur != null && cur.val <= toInsert.val) {
                cur = cur.next;
                prev = prev.next;
            }
            prev.next = toInsert;
            ListNode tmp = toInsert.next;
            toInsert.next = cur;
            toInsert = tmp;
        }
        return dummy.next;
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode toInsertPrev = head;
        ListNode toInsert = head.next;
        while (toInsert != null) {
            ListNode prev = dummy;
            ListNode cur = prev.next;
            while (cur != null && cur.val <= toInsert.val) {
                cur = cur.next;
                prev = prev.next;
            }
            prev.next = toInsert;
            toInsertPrev.next = toInsert.next;
            toInsert.next = cur;
            toInsert = toInsertPrev.next;
        }
        return dummy.next;
    }

}
