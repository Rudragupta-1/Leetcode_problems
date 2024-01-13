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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head.next;
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(curr!=null){
            if(curr.val!=0)
            sum+=curr.val;
            if(curr.val==0)
            {
                list.add(sum);
                sum=0;
            }
            curr=curr.next;
        }       
        ListNode temp=new ListNode(-1);
        ListNode ret=temp;
        for(int i=0;i<list.size();i++)
        {
            ListNode x=new ListNode(list.get(i));
            ret.next=x;
            ret=ret.next;
        }
        return temp.next;
    }
}