/*
 * Given a singly linked list, determine if it is a palindrome.

 * Follow up:
 * Could you do it in O(n) time and O(1) space?
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

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        for (int i = 0; i < (size + 1) / 2; i++) {
            if (list.get(i) != list.get(size - 1 - i))
                return false;
        }
        return true;
    }

}
