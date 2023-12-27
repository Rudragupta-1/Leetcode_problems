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
  public ListNode reverseKGroup(ListNode head, int k) {
      ListNode curr=head,next=null,prev=null;
      int c=0;
      ListNode h=head;int l=0;
      while(c<k && curr!=null)
      {
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
          c++;
      }
      ListNode temp=next;int o=0;
      while(temp!=null)
      {
          o++;
          temp=temp.next;
      }
      if(o<k)
      {
          head.next=next;
      }
      if(next!=null && o>=k)
      {
          ListNode r=reverseKGroup(next,k);
          head.next=r;
          
      }
      return prev;
  }
}