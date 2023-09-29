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
 //Insert into a Binary Search Tree
 //TC:O(n), SC:O(n)
 //Input: root = [4,2,7,1,3], val = 5
 //Output: [4,2,7,1,3,5]
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val > root.val) root.right = insertIntoBST(root.right, val);
        if(val < root.val) root.left = insertIntoBST(root.left, val);
        return root;
    }
}