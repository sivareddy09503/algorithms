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
 //Binary Tree Inorder Traversal
 //TC:O(n), SC:O(n), SC:O(1) for Morris's traversal approach
 //Input: root = [1,null,2,3]
 //Output: [1,3,2]
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        /*List<Integer> inorder = new ArrayList<>();
        if(root == null) return inorder;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while((!stack.isEmpty()) || curr != null) {
            while(curr!=null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            inorder.add(curr.val);
            curr = curr.right;
        }
        return inorder;*/
        //Morris's traversal approach
        List<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                inorder.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if(prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    inorder.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return inorder;
    }
}