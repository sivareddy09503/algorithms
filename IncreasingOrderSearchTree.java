//Increasing order search tree
//TC:O(n), SC:O(n)
//Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
//Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        findInOrder(root,inorder);
        if(inorder.size()==0) return null;
        TreeNode newRoot = new TreeNode(inorder.get(0));
        TreeNode temp1 = newRoot;
        TreeNode temp2;
        for(int i=1;i<inorder.size();i++) {
            temp2 = new TreeNode(inorder.get(i));
            temp1.right = temp2;
            temp1 = temp2;
        }
        return newRoot;
    }

    public void findInOrder(TreeNode root, ArrayList<Integer> temp) {
        if(root==null) return;
        findInOrder(root.left,temp);
        temp.add(root.val);
        findInOrder(root.right,temp);
    }
}