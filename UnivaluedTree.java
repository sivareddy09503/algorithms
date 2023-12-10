//Univalued Binary Tree
//TCO:(n), SC:O(n)
/*Input: root = [1,1,1,1,1,null,1]
Output: true*/
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
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isValid(root,val);
    }
    public boolean isValid(TreeNode root, int k) {
        if(root==null) return true;
        boolean left = isValid(root.left,k);
        boolean right = isValid(root.right,k);
        boolean check = root.val==k;
        return  check && left && right;
    }
}