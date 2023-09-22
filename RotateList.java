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
 //Rotate List
 //Input: head = [1,2,3,4,5], k = 2
 //Output: [4,5,1,2,3]
 //TC:O(n), SC:O(1)
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        if(k == 0)
            return head;
        int size = 0;
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
            size++;
        }
        size +=1;
        curr.next = head;
        k = k % size;
        curr = head;
        for(int i=1; i< size-k; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}