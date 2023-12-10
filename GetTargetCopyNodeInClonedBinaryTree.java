//Get Target Copy Node in a cloned binary tree
//TC:O(n), SC:O(1)
/*Input: tree = [7,4,3,null,null,6,19], target = 3
Output: 3
Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original tree. The answer is the yellow node from the cloned tree.*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode reference;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       dfs(original, cloned, target);
        return reference;
    }
    public void dfs(TreeNode original, TreeNode cloned, TreeNode target) {
        if(original == null) return;
        if(original.val==target.val) this.reference = cloned;
        dfs(original.left,cloned.left,target);
        dfs(original.right,cloned.right,target);
    }
}