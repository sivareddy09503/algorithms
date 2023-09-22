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
class MiddleOfLinkedList {
    //Middle of the Linked List
    //TC:O(n), SC:O(1)
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slowP = head, fastP = head;
        while(slowP != null && fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }
        return slowP;
    }
}