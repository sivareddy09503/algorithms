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
 //Search in a Binary Search Tree
 //O(n),SC:O(n)
 //Input: root = [4,2,7,1,3], val = 2
//Output: [2,1,3]
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val==val) return root;
        return (val<root.val)?searchBST(root.left,val):searchBST(root.right,val);
    }
}