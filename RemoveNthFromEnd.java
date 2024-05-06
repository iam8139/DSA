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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            return head.next;
        }

        int count = 0;
        temp = head;
        while (temp != null) {
            if (n == 1 && count == size-2) temp.next = null;
            else if (count == size-n-1) temp.next = temp.next.next;
            count++;
            temp = temp.next;
        }
        return head;
    }
}
