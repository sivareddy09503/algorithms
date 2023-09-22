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
 //Merge Two Sorted lists
 //TC:O(m+n), SC: O(1)
class MergdeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedNode = new ListNode(0);
        ListNode tail = mergedNode;
        while(true) {
            if(list1 == null) {
                tail.next = list2;
                break;
            }
            if(list2 == null) {
                tail.next = list1;
                break;
            }
            if(list1.val<=list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return mergedNode.next;
    }
}