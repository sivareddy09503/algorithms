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
 //Construct Binary Search Tree from Preorder Traversal
 //TC:O(n), SC:O(n)
 //Input: preorder = [8,5,1,7,10,12]
 //Output: [8,5,10,1,7,null,12]
class Solution {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null) return null;
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public TreeNode helper(int[] preorder, int start, int end) {
        if(preorder.length == index || preorder[index] < start || preorder[index] > end) return null;
        int val = preorder[index++];
        TreeNode node = new TreeNode(val);
        node.left = helper(preorder, start, val);
        node.right = helper(preorder, val, end);
        return node;
    }
}