/*
 * A linked list is given such that each node contains an additional 
 * random pointer which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
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

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = 
            new HashMap<RandomListNode, RandomListNode>();
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode cur = head;
        RandomListNode cur1 = dummy;
        while (cur != null) {
            RandomListNode node = new RandomListNode(cur.label);
            map.put(cur, node);
            cur = cur.next;
            cur1.next = node;
            cur1 = cur1.next;
        }
        cur = head;
        cur1 = dummy.next;
        while (cur != null) {
            cur1.random = map.get(cur.random);
            cur = cur.next;
            cur1 = cur1.next;
        }
        return dummy.next;
    }

/*******************************************************************/

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        while (cur != null) {
            RandomListNode node = new RandomListNode(cur.label);
            RandomListNode next = cur.next;
            cur.next = node;
            node.next = next;
            cur = next;
        }

    }

}
