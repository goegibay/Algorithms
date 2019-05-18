/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode L1 = dummy;
        ListNode L2 = head;
        while (L2 != null && L2.next != null) {
            ListNode newStart = L2.next.next;
            L2.next.next = L1;
            L1.next = L2.next;
            L2.next.next = L2;
            L2.next = newStart;
            L1 = L2;
            L2 = newStart;
        }
            
        return dummy.next;
    }
}
