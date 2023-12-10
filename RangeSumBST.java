//Range sum of BST
//TC:O(n), SC:O(n)
/*Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32*/
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
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return sum;
        dfs(root,low,high);
        return sum;
    }
    public void dfs(TreeNode root, int low, int high) {
        if(root==null) return;
        if(root.val>low) {
            dfs(root.left,low,high);
        }
        if(root.val>=low && root.val<=high) {
            sum += root.val;
        }
        if(root.val<high) {
            dfs(root.right,low,high);
        }
    }
}