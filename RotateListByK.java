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
class RotateListByK {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) return head;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int rot = size - (k%size);
        // System.out.println(rot + "\t" + k);
        if (rot == size) return head;

        temp = head;
        while (rot > 1 && temp != null) {
            temp = temp.next;
            rot--;
        }

        ListNode nextTemp = temp.next;
        temp.next = null;

        ListNode tempHead = nextTemp;
        while (nextTemp.next != null) {
            nextTemp = nextTemp.next;
        }
        nextTemp.next = head;

        return tempHead;
    }
}
