
package linkedlist;

/**
 *
 * @author Heba Ashour
 * 
 * 138. Copy List with Random Pointer
 * 
 * Question link: (https://leetcode.com/problems/copy-list-with-random-pointer/)
 * 
 */
public class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;
        Node currentCopy = null;
        HashMap<Node, Node> hm = new HashMap<>();
       
        int index = 0;
        while(current != null){            
            currentCopy = new Node(current.val);
            hm.put(current, currentCopy);
            current = current.next;
        }
        
        current = head;
        
        while(current != null){
            currentCopy = hm.get(current);
            currentCopy.next = hm.get(current.next);
            currentCopy.random = hm.get(current.random);
            current = current.next;
        }
        
        return hm.get(head);
        
    }
}
