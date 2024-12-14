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
    public ListNode swapPairs(ListNode head) {
        ListNode head1=head;
        while(head!=null && head.next!=null)
        {
            int temp=head.next.val;
            head.next.val=head.val;
            head.val=temp;
           // ListNode fir=head;
           // ListNode sec=head.next;
            //sec.next=head;
           // fir.next=head.next.next;
            head=head.next.next;


        }
        return head1;
    }
}