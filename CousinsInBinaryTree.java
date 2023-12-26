//Cousins in a binary tree
//TC:O(n), SC:O(1)
/*Input: root = [1,2,3,4], x = 4, y = 3
Output: false*/
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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(depthOf(root,x)!=depthOf(root,y)) {
            return false;
        } else {
            return getParent(root, null, x).val != getParent(root, null, y).val;
        }
    }
    public int depthOf(TreeNode root, int x) {
        if(root == null) {
            return 0;
        } else if(root.val == x) {
            return 1;
        } else {
            int left = depthOf(root.left,x);
            int right = depthOf(root.right,x);
            return (left>0 ? left+1 : right>0?right+1:0);
        }
    }
    public TreeNode getParent(TreeNode current, TreeNode parent, int value) {
        if(current==null) {
            return null;
        } else if(current.val == value) {
            return parent;
        } else {
            TreeNode left = getParent(current.left, current,value);
            return left != null ? left : getParent(current.right, current, value);
        }

    }
}