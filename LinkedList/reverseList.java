
package linkedlist;

/**
 *
 * @author Heba Ashour
 * 
 * Problem 206. Reverse Linked List
 * Description
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * 5000 <= Node.val <= 5000
 * 
 */
public class LeetCode {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = head;
        while(current != null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
