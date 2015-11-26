/*
 * Find the nth to last element of a singly linked list. 

The minimum number of nodes in list is n.

Example
Given a List  3->2->1->5->null and n = 2, return node  whose value is 1.
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
public class NthToLastNodeInList {

    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        while (first != null) {
            first = first.next;
            if (--n < 0) {
                second = second.next;
            }
        }
        return second;
    }

    ListNode nthToLast(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        while (first != null) {
            first = first.next;
            if (--n < 0) {
                second = second.next;
            }
        }
        return second;
    }

}
