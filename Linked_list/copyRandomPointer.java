/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
      if(head==null) return null;
      Node curr=head;
      while(curr!=null)
      {
          Node n=new Node(curr.val);
          n.next=curr.next;
          curr.next=n;
          curr=curr.next.next;
      }
      curr=head;
      Node copy=head.next;
      while(curr!=null)
      {
          if(curr.random!=null && curr.next!=null)
          {
              curr.next.random=curr.random.next;
          }
          else curr.next.random=null;
          curr=curr.next.next;
          
      }
      curr=head;
      copy=head.next;
      Node ret=copy;
      while(curr!=null){
          curr.next=curr.next.next;
          if(copy.next!=null)
          copy.next=copy.next.next;
          curr=curr.next;
          copy=copy.next;
      }
      return ret;
  }
}