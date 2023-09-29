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
 //Minimum Depth of Binary Tree
 //TC: O(n), SC: O(n)
 //Input: root = [3,9,20,null,null,15,7]
 //Output: 2
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return dfs(root);
    }
    public int dfs(TreeNode root) {
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null) return 1;
        int left = dfs(root.left);
        int right = dfs(root.right);
        return 1 + Math.min(left,right);

    }
}