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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            int a = currNode.val;
            int b = currNode.next.val;
            int currData = gcd(a, b);
            ListNode addNode = new ListNode(currData);
            addNode.next = currNode.next;
            currNode.next = addNode;
            currNode = currNode.next;
            currNode = currNode.next;
        }
        return head;
    }

    public static int gcd(int a, int b) {
        int min = Math.min(a, b);
        while (true) {
            if (a % min == 0 && b % min == 0)
                return min;
            min--;
        }
    }
}