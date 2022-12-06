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
    public ListNode oddEvenList(ListNode head) {
         ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode iter1 = dummy1;
        ListNode iter2 = dummy2;
        ListNode iter = head;
        int cnt = 1;
        while (iter != null) {
            if (cnt % 2 == 1) {
                iter1.next = iter;
                iter1 = iter1.next;
            } else {
                iter2.next = iter;
                iter2 = iter2.next;
            }
            iter = iter.next;
            cnt++;
        }
        iter2.next = null;
        iter1.next = dummy2.next;
        return dummy1.next;
    }
}