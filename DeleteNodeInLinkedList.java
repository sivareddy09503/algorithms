/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //Delete Node in a Linked List
 //TC:O(1), SC:O(1)
 //Input: head = [4,5,1,9], node = 5
 //Output: [4,1,9]
/*Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.*/
class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}