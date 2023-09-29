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
 //Binary Tree Preorder Traversal
 //TC:O(n), SC:O(n), SC:O(1) for Morris's traversal approach
 //Input: root = [1,null,2,3]
 //Output: [1,2,3]
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        /*List<Integer> preorder = new ArrayList<>();
        if(root == null) return preorder;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        while(!stack.isEmpty()) {
            curr = stack.pop();
            while(curr != null) {
                preorder.add(curr.val);
                if(curr.right != null)
                    stack.push(curr.right);
                curr = curr.left;
            }
        }
        return preorder;*/
        //Morris Traversal approach
        List<Integer> preorder = new ArrayList<>();
        if(root == null) return preorder;
        TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                preorder.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode rightMostChild = curr.left;
                while(rightMostChild.right != null && rightMostChild.right != curr) {
                    rightMostChild = rightMostChild.right;
                }

                if(rightMostChild.right == null) {
                    rightMostChild.right = curr;
                    preorder.add(curr.val);
                    curr = curr.left;
                } else {
                    rightMostChild.right = null;
                    curr = curr.right;
                }
            }
        }
        return preorder;
    }
}