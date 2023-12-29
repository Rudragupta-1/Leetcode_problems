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
  public ListNode detectCycle(ListNode head) {
      boolean isCycle=false;
      ListNode slow=head;
      ListNode fast=head;
      while(slow!=null && fast!=null && fast.next!=null)
      {
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast)
          {
              isCycle=true;
              break;
          }
      }
      if(isCycle==false) return null;
      slow=head;
      while(slow!=fast)
      {
          slow=slow.next;
          fast=fast.next;
      }
      return slow;
  }
}