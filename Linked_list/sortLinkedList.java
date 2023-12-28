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
  public ListNode sortList(ListNode head) {
      ArrayList<Integer> list=new ArrayList<>(); //Step-1
      ListNode curr=head;
      while(curr!=null)  //Step-2
      {
          list.add(curr.val);
          curr=curr.next;
      }

      Collections.sort(list); //Step-3

      int i=0;
      int l=list.size();
      ListNode o=new ListNode(-1);  //Step-4
      curr=o;
      while(l-->0)
      {
          ListNode n=new ListNode(list.get(i++));
          o.next=n;
          o=n;
      }
      return curr.next;
  }
}