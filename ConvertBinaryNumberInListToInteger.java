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
 //Convert Binary Number in a Linked List to Integer
 //TC:O(n), SC:O(1)
class ConvertBinaryNumberInListToInteger {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}