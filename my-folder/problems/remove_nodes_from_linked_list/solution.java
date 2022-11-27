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
    public ListNode removeNodes(ListNode head) 
        {
            if(head == null || head.next == null) return head;
            ListNode nex = removeNodes(head.next);
        
           if(nex.val > head.val) return nex;
           head.next = nex;
        
           return head;
        }
    
//     public void helper(head)
//     {
//         reverseList(head);
//         delhelper(head);
//         reverseList(head);
//     }
//     public void delhelper(ListNode head)
//     {
//         ListNode curr = head;
//         ListNode max = head;
//         ListNode temp;
        
//         while(curr != null && curr.next != null)
//         {
//             if(curr.next.val <max.val)
//             {
//                 temp = curr.next;
//                 curr.next = temp.next;
//                 temp = null;
//             }
//             else
//             {
//                 curr = curr.next;
//                 max = curr;
//             }
//         }
//     }
//     public ListNode removeNodes(ListNode head) {
//        return helper(head);      
//     }
//     public void reverseList(ListNode head)
//     {
//         ListNode curr = head;
//         ListNode prev = null;
//         ListNode nex ;
//         while(curr != null)
//         {
//             nex = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nex;
//         }
//         head = prev;
//     }
    
}