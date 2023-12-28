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
  public boolean isPalindrome(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
      ListNode prev=null;
      ListNode next;
      while(slow!=null)
      {
          next=slow.next;
          slow.next=prev;
          prev=slow;
          slow=next;
      }
      ListNode rh=prev;
      ListNode lh=head;
      while(rh!=null && lh!=null)
      {
          if(rh.val==lh.val)
          {
              lh=lh.next;
              rh=rh.next;
          }
          else{
              return false;
          }
      }
      return true;
  }
}