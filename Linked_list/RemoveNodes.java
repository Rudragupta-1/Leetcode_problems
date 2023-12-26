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
  public static ListNode rev(ListNode curr,ListNode prev)
  {
      if(curr==null) return prev;
      ListNode next=curr.next;
      curr.next=prev;
      return rev(next,curr);
  }
  public ListNode removeNodes(ListNode head) {
      ListNode temp=rev(head,null);
      ListNode ret=temp;int max=Integer.MIN_VALUE;ListNode prev=null;
      while(ret!=null)
      {
          if(ret.val<max){
              prev.next=ret.next;
          }
          else{
                  max=ret.val;
                  prev=ret;
          }
          ret=ret.next;
      }
      return rev(temp,null);
  }
}