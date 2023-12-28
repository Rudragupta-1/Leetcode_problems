/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
      if(head==null) return false;
      ListNode slow=head; // slow-> tortoise;
      ListNode fast=head; // fast-> hare;
      ListNode curr=head;
      
      // use floyd's algorithm
      while( slow!=null && fast!=null && fast.next!=null )
      {
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast)
          return true;
      }
      return false;
  }
}