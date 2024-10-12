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
    public ListNode deleteMiddle(ListNode head) {
        ListNode head1=head;
        ListNode head2=head;
        if(head1.next==null || head1==null)
        {
            return null;
        }
        int size=0;
        
        while(head.next!=null)
        {
            head=head.next;
            size++;
        }
        for(int i=0;i<(size-1)/2;i++)
        {
            head1=head1.next;
        }
        head1.next=head1.next.next;
        return head2;
    }
}