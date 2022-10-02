
package linkedlist;

/**
 *
 * @author Heba Ashour
 * 
 * 160. Intersection of Two Linked Lists
 * 
 * Description
 * Given the heads of two singly linked-lists headA and headB, 
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 * 
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA, currentB = headB;
        
        while(currentA != currentB){
            if(currentA != null) currentA = currentA.next; else currentA = headB;
            if(currentB != null) currentB = currentB.next; else currentB = headA;
        }
        return currentA;
    }
  
}
