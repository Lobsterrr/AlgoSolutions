/*
 * A linked list is given such that each node contains an additional 
 * random pointer which could point to any node in the list or null.

Return a deep copy of the list.

Example
Challenge
Could you solve it with O(1) space?
 */
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyListWithRandomPointer {

    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        while (cur != null) {
            RandomListNode next = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur = next;
        }
        cur = head == null ? null : head.random;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        RandomListNode copy = head == null ? null : head.next;
        cur = head;
        while (cur != null) {
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return copy;
    }

}
