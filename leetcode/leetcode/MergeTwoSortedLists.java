/*
Merge two sorted linked lists and return it as a new list. The new list should
be made by splicing together the nodes of the first two lists.

 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null || cur2 != null) {

        }


        return dummy.next;
    }

}
