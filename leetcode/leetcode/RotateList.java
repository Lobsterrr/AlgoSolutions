/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        for (; cur2 != null && cur2.next != null; cur2 = cur2.next) {
            k--;
            if (k < 0) {
                cur1 = cur1.next;
            }
        }
        cur2.next = head;
        head = cur1.next;
        cur1.next = null;
        return head;
    }

}
