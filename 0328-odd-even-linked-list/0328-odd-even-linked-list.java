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
        if(head==null || head.next==null)
        return head;
        ListNode evenNodes=head;
    
        
        ListNode oddNodes=head.next;
        ListNode allNodes=oddNodes;
        while(oddNodes!=null && oddNodes.next!=null)
        {
            evenNodes.next=oddNodes.next;
            evenNodes=evenNodes.next;
            oddNodes.next=evenNodes.next;
            oddNodes=oddNodes.next;
        }
        evenNodes.next=allNodes;
        return head;
    }
}