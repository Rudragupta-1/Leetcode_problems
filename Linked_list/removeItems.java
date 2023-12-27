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
  public ListNode removeElements(ListNode head, int val) {
     if(head==null) return null; 
     
      ListNode curr=head;
      ListNode prev=new ListNode(-1,head);
      ListNode retur=prev;
      while(curr!=null)
      {
          if(curr.val!=val)
          {
              prev=curr;
              curr=curr.next;
          }
         else if(curr.val==val){
          while(curr!=null && curr.val==val)
          {
              curr=curr.next;
          }
          prev.next=curr;
          prev=curr;
          if(curr!=null)
          curr=curr.next;
      }
      }
      return retur.next;
  }
}