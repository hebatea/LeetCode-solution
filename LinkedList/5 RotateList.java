
package linkedlist;

/**
 *
 * @author Heba Ashour
 * 
 * 61. Rotate List
 * 
 * Question link: (https://leetcode.com/problems/rotate-list/)
 * 
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode current = head, tail = null;
        int length = 0;
        
        if(head == null) return head;

        while(current.next!= null){
            length++;
            current = current.next;
        }
        tail = current;
        length++; 
        
        if(k > length){
            k = k % length;
        }
        
        if(k == 0 || k == length) return head;
        
        
        current = head;
        int count = 0;
        while(++count < (length-k)){
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next = null;
       
        tail.next = head;
        return newHead;
    }
    
    
}
