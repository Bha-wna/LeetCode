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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = len(head);
        ListNode temp = head;
        if(l==n)
          return head.next;

        for(int i=0; i<l-n-1;i++)
        {
          temp = temp.next;  
        }
        ListNode li = temp.next.next;
        temp.next = null;
        temp.next = li;
        return head;
    }
    int len(ListNode head)
    {
        int l =0;
        ListNode temp = head;
        while(temp != null)
        {
            temp = temp.next;
            l++;
        }
        return l;
    }
}