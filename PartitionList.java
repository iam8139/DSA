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
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode prevNode = null;
        boolean check = false;
        while (temp != null) {
            if (temp.val < x) {
                if (prev != null && prev.next != temp) {
                    ListNode next = prev.next;
                    prev.next = temp;
                    ListNode tempNext = temp.next;
                    temp.next = next;
                    prevNode.next = tempNext;

                    prevNode = prev;
                    prev = temp;
                } else {
                    if (prevNode != null && check) {
                        ListNode tempNext = temp.next;
                        prevNode.next = tempNext;
                        if (temp.next == null) {
                            temp.next = head;
                            head = temp;
                            break;
                        }
                        temp.next = head;
                        head = temp;
                    }
                    prev = temp;
                }
            } else check = true;
            prevNode = temp;
            temp = temp.next;
        }

        return head;
    }
}
