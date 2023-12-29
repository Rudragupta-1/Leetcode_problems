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
  public ListNode rotateRight(ListNode head, int k) {

      if(k==0) return head;
      if(head==null) return head;
      int l=0;
      ListNode lcurr=head;
      while(lcurr!=null)
      {
          lcurr=lcurr.next;
          l++;
      }
      if(k%l==0) return head;
      int nk=k%l;
      int iter=l-nk;
      if(l==1) return head;
      ListNode prev=new ListNode(-1,head);
      ListNode curr=head;
      ListNode end=head;
      while(end.next!=null)
      {
          end=end.next;
      }
      for(int i=0;i<iter;i++)
      {
          curr=curr.next;
          prev=prev.next;
      }
      prev.next=null;
      end.next=head;
      return curr;
  }
}