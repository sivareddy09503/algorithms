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
 //Diameter of Binary Tree
 //TC: O(n), SC: O(n)
 //Input: root = [1,2,3,4,5]
 //Output: 3
class Solution {
    int DIAMETER = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        helper(root);
        return DIAMETER;        
    }
    public int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        DIAMETER = Math.max(DIAMETER, left+right);
        return 1+Math.max(left,right);
    }
}