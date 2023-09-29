/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
//Populating Next Right Pointers in Each Node II
//TC:O(n), SC:O(1)
//Input: root = [1,2,3,4,5,null,7]
//Output: [1,#,2,3,#,4,5,7,#]
class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Node levelStart = root;
        while(levelStart != null) {
            Node curr = levelStart;
            Node dummy = new Node(0);
            Node prev = dummy;
            while(curr != null) {
                if(curr.left != null) {
                    prev.next = curr.left;
                    prev = prev.next;
                }
                if(curr.right != null) {
                    prev.next = curr.right;
                    prev = prev.next;
                }
                curr = curr.next;
            }
            levelStart = dummy.next;
            dummy.next = null;
        }
    return root;  
    }
}