//Sum of left leaves in BST
//TC:O(1), SC:O(n)
/*Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively*/
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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);
    }
    public int helper(TreeNode root) {
        int sum=0;
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null) {
            sum+=root.left.val;
        }
        sum += helper(root.left);
        sum += helper(root.right);
        return sum;
    }
}