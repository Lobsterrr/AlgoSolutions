/*
 *
 */

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        while (cur != null) {
            if (cur.val != val) {
                pre.next = cur;
                pre = cur;
            }
            cur = cur.next;
        }
        pre.next = cur;
        return dummy.next;
    }

}
