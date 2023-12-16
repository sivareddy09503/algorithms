//Sum of root to leaf binary numbers
//TC:O(n),SC:O(n)
/*Input: root = [1,0,1,0,1,0,1]
Output: 22
Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22*/
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
    public int sumRootToLeaf(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode node, int sum) {
        if(node==null) return 0;
        sum = (sum*2)+node.val;
        if(node.left==null&&node.right==null) return sum;
        return helper(node.left,sum) + helper(node.right,sum);
    }
}