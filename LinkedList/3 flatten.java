
package linkedlist;

/**
 *
 * @author Heba Ashour
 * 
 * 430. Flatten a Multilevel Doubly Linked List
 * 
 * Question link: (https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/)
 * 
 */
public class flatten {
    public Node flatten(Node head) {
        Node current = head;
        while(current != null){
            if(current.child != null){
                Node tail = current.child;
            
                while(tail.next != null){
                    tail = tail.next;
                }
                tail.next = current.next;
                
                if(current.next != null)
                    current.next.prev = tail;
                
                current.next = current.child;
                current.child.prev = current;
                current.child = null;
            }
            current = current.next;
        }
        
        return head;
    }
  
}
