/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == node.val) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        node = dummy.next;
        dummy.next = null;
    }

}
