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
    public int pairSum(ListNode head) {
        int size=0;
        ListNode head1=head;
        while(head1!=null)
        {
            size++;
            head1=head1.next;
        }
        int arr[]=new int[(int)(size/2)];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size/2;i++)
        {
            arr[i]=head.val;
            head=head.next;
        }
        int k=arr.length-1;
        while(head!=null)
        {
            if((arr[k]+head.val)>max)
            max=arr[k]+head.val;
            head=head.next;
            k--;
        }
        return max;
    }
}