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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode c=head;
        while(c!=null)
        {
            n++;
            c=c.next;
        }
        Stack<Integer> st=new Stack<>();
        ListNode curr=head;
        ListNode prev=null;
        int i=n/2-1;
        while(i-->=0)
        {
            st.push(curr.val);
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        prev=null;
        ListNode next;
        ListNode temp=curr;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Stack<Integer> stt=new Stack<>();
        while(prev!=null)
        {
            stt.push(prev.val);
            prev=prev.next;
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(!st.isEmpty()&&!stt.isEmpty())
        {
            sum=0;
            sum+=st.pop();
            sum+=stt.pop();
            max=Math.max(max,sum);
        }
        return max;
    }
}
