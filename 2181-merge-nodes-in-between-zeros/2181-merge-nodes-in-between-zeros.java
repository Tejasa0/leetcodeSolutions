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
    public ListNode mergeNodes(ListNode head) {
        ListNode first = head;
        ListNode sec = head.next;
        while (sec != null) {
            int sum = 0;
            while (sec.val != 0) {
                sum += sec.val;
                sec = sec.next;
            }
            first.val = sum;
            sec = sec.next;
            first.next = sec;
            first = first.next;
        }
        return head;
    }
}