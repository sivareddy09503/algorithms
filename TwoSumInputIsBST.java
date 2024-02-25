//Two sum if input is a BST
//TC:O(nlogn), SC:O(n)
/*Input: root = [5,3,6,2,4,null,7], k = 9
Output: true*/
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        int i=0, j=lst.size()-1;
        while(i<j) {
            int currSum = lst.get(i)+lst.get(j);
            if(currSum==k) return true;
            else if(currSum>k) j--;
            else i++;
        }
        return false;
    }
    public void inorder(TreeNode root, List<Integer> lst) {
        if(root == null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}