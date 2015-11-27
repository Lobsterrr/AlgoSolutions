/*
 *
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
public class LinkedListCycle {

    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {  
        // write your code here
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            if (cur == head) {
                return true;
            }
        }
        return false;
    }

}
