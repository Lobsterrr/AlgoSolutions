/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
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
public class RemoveDuplicatesFromSortedListII {

    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = prev.next;
        while (cur != null) {
            if (cur != null && prev.next.val == cur.val) {
                cur = cur.next;
            } else if (prev.next.next == cur) {
                prev = prev.next;
            } else {
                prev.next = cur;
            }
        }
        return dummy.next;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = prev.next;
        while (cur != null) {
            while (cur != null && prev.next.val == cur.val) {
                cur = cur.next;
            }
            if (prev.next.next == cur) {
                prev = prev.next;
            } else {
                prev.next = cur;
            }
        }
        return dummy.next;
    }

}
