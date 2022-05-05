/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
       ListNode mid = middleNode(head);
       ListNode secondHead = reverse(mid);
       ListNode firstHead = head;
       ListNode temp = null; 
      // ListNode newList = head; 
       
        while(firstHead != null && secondHead != null)
        {  
           temp = firstHead.next;
           firstHead.next = secondHead;
           firstHead = temp;
           temp = secondHead.next;
           secondHead.next = firstHead;
           secondHead = temp;       
        }
        
        if(firstHead != null)
          firstHead.next = null;  
   }
    public ListNode middleNode(ListNode head)
    {
        ListNode s = head;
        ListNode f = head;
        
        while(f != null && f.next !=null)
        {
            s= s.next;
            f= f.next.next;
        }
        return s;
    }
    private ListNode reverse(ListNode head)
    {
        ListNode pres= head;
        ListNode prev = null;
        ListNode next = pres.next;
        
        while(pres != null)
        {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
                next = next.next;
        }
        return prev;
    
}
}