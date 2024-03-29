/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//Intersection of Two Linked Lists
//TC:O(m+n), SC:O(1)
public class IntersectioOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA, curr2 = headB;
        while (curr1 != curr2) { 
            curr1 = curr1 == null ? headB : curr1.next; 
            curr2 = curr2 == null ? headA : curr2.next; 
	    }
	    return curr1;
    }
}