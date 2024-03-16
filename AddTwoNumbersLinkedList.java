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
class AddTwoNumbersLinkedList {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode lastNode = null;
        while (l1 != null || l2 != null){
            if (l1 == null && l2 != null){
                int sum = l2.val + carry;
                int value = 0;
                if (sum >= 10){
                    value = sum%10;
                    carry = sum/10;
                }else {
                    value = sum;
                    carry = 0;
                }
                lastNode = new ListNode(value, lastNode);
                l2 = l2.next;
            } else if (l1 != null && l2 == null){
                int sum = l1.val + carry;
                int value = 0;
                if (sum >= 10){
                    value = sum%10;
                    carry = sum/10;
                }else {
                    value = sum;
                    carry = 0;
                }
                lastNode = new ListNode(value, lastNode);
                l1 = l1.next;
            } else {
                int sum = l1.val + l2.val + carry;
                int value = 0;
                if (sum >= 10){
                    value = sum%10;
                    carry = sum/10;
                }else {
                    value = sum;
                    carry = 0;
                }
                lastNode = new ListNode(value, lastNode);
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        
        if (carry > 0){
            lastNode = new ListNode(carry, lastNode);
        }
        
        ListNode temp = null;
        while (lastNode != null){
            temp = new ListNode(lastNode.val, temp);
            lastNode = lastNode.next;
        }
        return temp;
    }
}