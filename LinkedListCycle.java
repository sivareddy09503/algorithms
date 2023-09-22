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
 //Linked List Cycle
 //TC:O(n), SC:O(1)
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slowP = head, fastP = head;
        while(slowP != null && fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if(slowP == fastP)
                return true;
        }
        return false;
    }
}