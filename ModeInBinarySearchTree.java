//Find mode in BST
//TC:O(n), SC:O(n)
//Input: root = [1,null,2,2]
//Output: [2]
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
    private int currentVal;
    private int currentCount = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] result = new int[modes.size()];
        for(int i=0;i<modes.size();i++) {
            result[i] = modes.get(i);
        }
        return result;
    }
    public void inOrderTraversal(TreeNode root) {
        if(root==null) return;
        inOrderTraversal(root.left);
        currentCount = (root.val==currentVal) ?currentCount+1:1;
        if(currentCount == maxCount) {
            modes.add(root.val);
        } else if(currentCount > maxCount){
            maxCount = currentCount;
            modes.clear();
            modes.add(root.val);
        }
        currentVal = root.val;
        inOrderTraversal(root.right);
    }
}