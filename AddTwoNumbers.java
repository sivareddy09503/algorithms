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
 //Add two linked lists
 //TC:O(n), SC:O(n)
 //Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        ListNode p1 = l1, p2 = l2;
        int carry = 0;
        while(p1!=null || p2!=null) {
            int x = (p1!=null) ? p1.val:0;
            int y = (p2!=null) ? p2.val:0;
            int sum = x+y+carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(p1!=null) p1 = p1.next;
            if(p2!=null) p2 = p2.next;
        }
        if(carry>0) {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
}