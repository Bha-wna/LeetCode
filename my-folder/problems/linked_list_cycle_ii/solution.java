/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
        
       int l = lengthCycle(slow);
        if(l == -1)
            return null;
        System.out.println(l);
        for(int i=0; i< l; i++)
        {
            slow= slow.next;
        }
        while(fast!= slow)
        {
            fast=fast.next;
            slow= slow.next;
        }
        
        return slow;
    }
      public int lengthCycle(ListNode head)
      {
          ListNode f = head;
          ListNode s = head;
          int length = 0;
          while(f!=null && f.next != null )
          {
              f= f.next.next;
              s= s.next;
              if(f == s)
              {  ListNode temp = s;
                 do
                 {
                     temp = temp.next; 
                      length++;
                  }while(temp != s);
                return length;
              }
          }
         return -1; 
      }
}