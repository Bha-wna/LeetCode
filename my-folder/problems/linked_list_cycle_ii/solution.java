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
      Map<ListNode, Integer> m = new HashMap<>();
      ListNode temp = head;
        while(temp != null && temp.next !=null)
        {
            m.putIfAbsent(temp,0);
            m.put(temp,m.get(temp)+1);
            if(m.get(temp) == 2)
                return temp;
            temp = temp.next;
        }
        return null;
    }
}