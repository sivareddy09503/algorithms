//Symmetric binary tree
//TC:O(n),SC:O(h), n is no of nodes and h is height of tree
//Input: root = [1,2,2,3,4,4,3]
//Output: true
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return check(root.left,root.right);
    }
    public boolean check(TreeNode l, TreeNode r) {
        if(l==null && r == null) return true;
        if(l==null || r == null || l.val != r.val) return false;
        return check(l.left,r.right) && check(l.right,r.left);
    }
}