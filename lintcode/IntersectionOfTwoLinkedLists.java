/*
 *
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) 
            return null;
        ListNode cur = headA;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = headB;

    }

}
