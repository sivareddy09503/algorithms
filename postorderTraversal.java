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
 //Binary Tree Postorder Traversal
 //TC:O(n), SC:O(n)
 //Input: root = [1,null,2,3]
 //Output: [3,2,1]
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        if(root == null) return postorder;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        while(!stack.isEmpty()) {
            curr = stack.pop();
            //root,right,left
            while(curr!=null) {
                postorder.add(curr.val);
                if(curr.left != null)
                    stack.push(curr.left);
                curr = curr.right;
            }
        }
        //left,right,root
        Collections.reverse(postorder);
        return postorder;
    }
}