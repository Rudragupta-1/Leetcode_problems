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
  public ListNode insertionSortList(ListNode head) {
      if(head==null) return null;
      ListNode curr=head;
      ListNode next=null;
      ListNode help=new ListNode(-1);
      ListNode prev=help;
      while(curr!=null)
      {
          next=curr.next;
          while(prev.next!=null && prev.next.val<curr.val)
          {
              prev=prev.next;
          }
          curr.next=prev.next;
          prev.next=curr;
          prev =help;
          curr=next;
      }
      return help.next;
  }
}