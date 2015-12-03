/*
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {

    /**
     * @param head a ListNode
     * @return a boolean
     */
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next, len++);
        
        ListNode cur = head;
        for (int i = 0; i < (len - 1) / 2; ++i, cur = cur.next);
        ListNode second = cur.next;
        

    }

}
