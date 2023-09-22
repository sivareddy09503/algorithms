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
 //Palindrome Linked List
 //TC:O(n), SC:O(n)
 //Input: head = [1,2,2,1]
 //Output: true
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<Integer>();
        while(temp!=null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head!=null) {
            int i = stack.pop();
            if(i==head.val) {
                isPalin = true;
            } else {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
}