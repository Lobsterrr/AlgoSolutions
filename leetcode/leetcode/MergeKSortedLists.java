/*
Merge k sorted linked lists and return it as one sorted list. Analyze and
describe its complexity.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; ++i) {
            result = merge2Lists(result, lists[i]);
        }
        return result;
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (l1 != null && l2 != null) {
            if (cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if (cur1 != null) {
            cur.next = cur1;
        } else {
            cur.next = cur2;
        }
        return dummy.next;
    }

}
