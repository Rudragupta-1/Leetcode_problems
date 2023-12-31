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
  public static ListNode reverseList(ListNode head)
 {
     ListNode prev=null;
     ListNode curr=head;
     ListNode next;
     while(curr!=null)
     {
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
     }
     return prev;
 }
 public ListNode addTwoNumbers(ListNode first, ListNode second) {
    
 
     // code here
     // return head of sum list
     int carry=0;
     int sum=0;
     ListNode l1=reverseList(first);
     ListNode l2=reverseList(second);
     ListNode t1=l1;
    ListNode t2=l2;
     ListNode o=new ListNode(0);
     ListNode r1=o;
     while(t1!=null && t2!=null)
     {
         ListNode n=new ListNode((t1.val+t2.val+carry)%10);
         o.next=n;
         o=n;
         carry=(t1.val+t2.val+carry)/10;
         t1=t1.next;
         t2=t2.next;
     }
     while(t1!=null)
     {
         ListNode n1=new ListNode((t1.val+carry)%10);
         o.next=n1;
         o=n1;
         carry=(t1.val+carry)/10;
         t1=t1.next;
     }
     while(t2!=null)
     {
         ListNode n1=new ListNode((t2.val+carry)%10);
         o.next=n1;
         o=n1;
         carry=(t2.val+carry)/10;
         t2=t2.next;
     }
     if(carry!=0)
     {
         ListNode c=new ListNode(carry);
         o.next=c;
         o=c;
     }
     return reverseList(r1.next);
 }
}