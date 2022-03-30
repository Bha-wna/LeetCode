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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode node = head;
        if(node==null)
            return node;
        while(node.next != null)
        {
            if(node.val== node.next.val)
            {
                node.next = node.next.next;
                //size--;
            }
            else 
                node = node.next;
        }
       return head;
    }
}