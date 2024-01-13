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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        int carry=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            int sum=(temp.val*2);
            int num=sum%10;
             temp.val=num+carry;
            carry=sum/10;
            prev=temp;
            temp=temp.next;
        }
        if(carry>0)
        {
            ListNode rudra=new ListNode(carry);
            prev.next=rudra;
        }
        head=reverse(head);
        return head;
    }
}
