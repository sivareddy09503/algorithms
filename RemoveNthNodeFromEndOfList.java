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
 //Remove nth node from end of list
 //TC:O(n), SC:O(1)
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int nodeFromBeginning = length(head)-n+1;
        ListNode prev = null;
        ListNode temp = head;
        for(int i=1;i<nodeFromBeginning;i++) {
            prev = temp;
            temp = temp.next;
        }

        if(prev==null) {
            head = head.next;
            return head;
        } else {
            prev.next = prev.next.next;
            return head;
        }        
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}