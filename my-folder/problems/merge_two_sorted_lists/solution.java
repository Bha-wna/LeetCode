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
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f = list1;
        ListNode s = list2;
        ListNode ans = new ListNode();
        ListNode ret = ans;
        
        while(list1 != null && list2 != null)
        {
            if(list1.val< list2.val)
            {
                ans.next =list1;
                list1 = list1.next; 
            }
            else
            {  ans.next = list2;
                list2 =  list2.next;
            }
            ans = ans.next;
        }
        while(list1 != null)
        {
            ans.next = list1;
            list1= list1.next;
            ans = ans.next;
        }
         while(list2 != null)
        {
            ans.next = list2;
            list2= list2.next;
            ans = ans.next;
        }
        return ret.next;
    }
}