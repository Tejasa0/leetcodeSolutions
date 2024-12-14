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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        if(head==null || (head.next==null && n==1))
        return null;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        head=temp;
        while(temp!=null)
        {
            if(count==n+1)
            {
                temp.next=temp.next.next;
                break;
            }
            count--;
            temp=temp.next;
        }
        return head;
    }
}