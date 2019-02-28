/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode root = new ListNode(0);
        
        while(head != null) {
            ListNode next = head.next;
            head.next = root.next;
            root.next = head;
            head = next;
        }
        
        return root.next;
    }
}
