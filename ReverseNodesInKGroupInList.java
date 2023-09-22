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
 //Reverse Nodes in k-Group
 //TC:O(nk), SC:O(n/k)
class ReverseNodesInKGroupInList {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)
            return head;
        int count = k;
        ListNode curr = head;
        while(curr != null && count != 0) {
            count--;
            curr = curr.next;
        }
        if(count>0)
            return head;
        ListNode prev = reverseKGroup(curr, k);
        ListNode currHead = head;
        for(int i=0; i<k; i++) {
            ListNode next = currHead.next;
            currHead.next = prev;
            prev = currHead;
            currHead = next;
        }
        return prev;
    }
}