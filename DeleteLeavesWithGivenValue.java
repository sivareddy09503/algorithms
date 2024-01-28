//Delete leaves with a given value
//TC:O(n), SC:O(n)
/*Input: root = [1,2,3,2,null,2,4], target = 2
Output: [1,null,3,null,4]
Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left). 
After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).*/
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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return dfs(root,target);
    }
    public TreeNode dfs(TreeNode root, int target) {
        if(root==null) {
            return null;
        }
        root.left = dfs(root.left,target);
        root.right = dfs(root.right,target);
        if(root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }
}