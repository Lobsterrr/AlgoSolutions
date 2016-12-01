/*
You are given two linked lists representing two non-negative numbers. The 
digits are stored in reverse order and each of their nodes contain a single 
digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carrier = 0;
        while (cur1 != null || cur2 != null || carrier > 0) {
            carrier += cur1 != null ? cur1.val : 0;
            carrier += cur2 != null ? cur2.val : 0;
            if (cur1 != null) {
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                cur2 = cur2.next;
            }
            cur.next = new ListNode(carrier % 10);
            cur = cur.next;
            carrier /= 10;
        }
        return dummy.next;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carrier = 0;
        while (cur1 != null || cur2 != null) {
            int value1 = cur1 != null ? cur1.val : 0;
            int value2 = cur2 != null ? cur2.val : 0;
            if (cur1 != null) {
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                cur2 = cur2.next;
            }
            cur.next = new ListNode((value1 + value2 + carrier) % 10);
            cur = cur.next;
            carrier = (value1 + value2 + carrier) / 10;
        }
        if (carrier != 0) {
            cur.next = new ListNode(carrier);
        }
        return dummy.next;
    }

}
