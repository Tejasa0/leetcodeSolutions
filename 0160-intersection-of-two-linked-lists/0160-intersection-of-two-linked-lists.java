/**
 * Definition for singly-linked list.
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
        if (headA == null || headB == null)
            return null;
        ListNode tem1 = headA;
        ListNode tem2 = headB;
        while (tem1 != tem2) {
            tem1 = tem1 == null ? headB : tem1.next;
            tem2 = tem2 == null ? headA : tem2.next;
        }
        return tem1;
    }
}