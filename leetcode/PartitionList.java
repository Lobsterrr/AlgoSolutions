/*
 * Given a linked list and a value x, partition it such that all nodes less than x come before 
 * nodes greater than or equal to x.

 * You should preserve the original relative order of the nodes in each of the two partitions.

 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode cur = head;
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        while (cur != null) {
            if (cur.val < x) {
                list1.add(cur.val);
            } else {
                list2.add(cur.val);
            }   
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        cur = dummy;
        for (int val : list1) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        for (int val : list2) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }

/*******************************************************************/

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode sCur = small, lCur = large;
        while(head != null) {
            if(head.val < x) {
                sCur.next = head;
                sCur = sCur.next;
            } else {
                lCur.next = head;
                lCur = lCur.next;
            }
            head = head.next;
        }
        sCur.next = large.next;
        lCur.next = null;
        return small.next;
    }
}
