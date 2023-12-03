//Evaluate Boolean Binary Tree
//TC:O(n), SC:O(n)
/*Input: root = [2,1,3,null,null,0,1]
Output: true
Explanation: The above diagram illustrates the evaluation process.
The AND node evaluates to False AND True = False.
The OR node evaluates to True OR False = True.
The root node evaluates to True, so we return true*/
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
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null) {
            return root.val==0?false:true;
        } else if(root.val==2) {
            return (evaluateTree(root.left)) || (evaluateTree(root.right));
        } else {
            return (evaluateTree(root.left)) && (evaluateTree(root.right));
        }
    }
}