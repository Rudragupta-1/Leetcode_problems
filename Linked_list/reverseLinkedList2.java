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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        int y = 1;

        while (y < left && curr != null) {
            prev = curr;
            curr = curr.next;
            y++;
        }

        ListNode originalPrev = prev;
        ListNode reversedTail = curr;

        int x = right - left + 1;
        ListNode last = null;

        while (x > 0 && curr != null) {
            ListNode next = curr.next;
            curr.next = last;
            last = curr;
            curr = next;
            x--;
        }

        if (originalPrev != null) {
            originalPrev.next = last;
        } else {
            head = last;
        }

        reversedTail.next = curr;

        return head;
    }
}
