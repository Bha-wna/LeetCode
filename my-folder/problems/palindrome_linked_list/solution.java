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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid);
      //  ListNode reverseHead = headSecond;
        
        while(head !=null && headSecond!= null)
        {
            if(head.val != headSecond.val)
                break;
            head = head.next;
            headSecond = headSecond.next;
        }
       // reverse(reverseHead);
        
        if(head ==null || headSecond == null)
            return true;
        
        return false;
    }
    public ListNode middleNode(ListNode head)
    {
        ListNode s= head;
        ListNode f= head;
        
        while(f != null && f.next != null)
        {
            s=s.next;
            f= f.next.next;
        }
        return s;
    }
    
   private ListNode reverse(ListNode head)
    {
        ListNode pres = head;
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