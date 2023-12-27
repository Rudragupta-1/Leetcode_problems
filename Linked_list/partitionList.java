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
  public ListNode partition(ListNode head, int x) {
      ArrayList<Integer> list=new ArrayList<>();
      ListNode curr=head;
      while(curr!=null)
      {
          if(curr.val<x)
          list.add(curr.val);
          curr=curr.next;
      }
      curr=head;
      while(curr!=null){
          if(curr.val>=x)
          list.add(curr.val);
          curr=curr.next;
      }
      int l=list.size();int i=0;ListNode o=new ListNode(-1);
      ListNode ret=o;
      while(l-->0 ){
      ListNode n=new ListNode(list.get(i++));
      o.next=n;
      o=n;
      }
      return ret.next;
  }
}