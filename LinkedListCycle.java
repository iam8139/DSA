/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (slowNode == fastNode) return true;
        }

        return false;
        
        // Set<ListNode> map = new HashSet<>();
        // while(head != null) {
        //     if (map.contains(head)) return true;
        //     map.add(head);
        //     head = head.next;
        // }
        // return false;
    }
}