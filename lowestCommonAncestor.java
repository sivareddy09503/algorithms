/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Lowest Common Ancestor of a Binary Tree
 //TC: O(n), SC: O(n)
 //Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 //Output: 3
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) return root;
        return dfs(root,p,q);
    }
    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        if(root.left == null && root.right == null) return null;
        TreeNode lcaLeft = dfs(root.left, p, q);
        TreeNode lcaRight = dfs(root.right, p, q);
        if(lcaLeft == null) return lcaRight;
        if(lcaRight == null) return lcaLeft;
        return root;
    }
}