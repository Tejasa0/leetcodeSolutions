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
    public ListNode oddEvenList(ListNode head) {
        //int n=1;
        if(head==null || head.next==null)
        return head;
        ListNode oddNode=head;
        ListNode currNode1=head.next;
        ListNode actualEven=currNode1;
        while(currNode1!=null && currNode1.next!=null)
        {
            oddNode.next=currNode1.next;
            //head.next=head.next.next;
            oddNode=oddNode.next;
            currNode1.next=oddNode.next;
            currNode1=currNode1.next;
        }
        oddNode.next=actualEven;
        return head;
    }
}