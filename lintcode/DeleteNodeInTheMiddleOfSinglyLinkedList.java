/*
 * Implement an algorithm to delete a node in the middle of 
 * a singly linked list, given only access to that node.

Have you met this question in a real interview? Yes
Example
Given 1->2->3->4, and node 3. return 1->2->4
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
public class DeleteNodeInTheMiddleOfSinglyLinkedList {

    public void deleteNode(ListNode node) {
        ListNode cur1 = node;
        ListNode cur2 = node;
        while (cur2 != null && cur2.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }

    }

    public void deleteNode(ListNode node) {
        ListNode dummy = new ListNode(0);
        dummy.next = node;
    }

}
