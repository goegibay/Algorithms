tion for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        int lenA = len(headA);
        int lenB = len(headB);
        
        if (lenA > lenB) {
            while (lenA != lenB) {
                headA = headA.next;
                lenA--;
            }
        } else if (lenA < lenB) {
            while (lenA != lenB) {
                headB = headB.next;
                lenB--;
            }
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
    
    private int len(ListNode node) {
        int len = 0;
        
        while (node != null) {
            node = node.next;
            len++;
        }
        return len;
    }
}
