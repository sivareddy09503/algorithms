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
 //Binary Tree Level Order Traversal
 //TC: O(n), SC: O(n)
 //Input: root = [3,9,20,null,null,15,7]
 //Output: [[3],[9,20],[15,7]]
class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null)
            return traversal;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelOrder = new ArrayList<>();
            while(size>0) {
                TreeNode tmp = queue.poll();
                if(tmp.left != null) queue.add(tmp.left);
                if(tmp.right != null) queue.add(tmp.right);
                levelOrder.add(tmp.val);
                size--;
            }
            traversal.add(levelOrder);
        }
        return traversal;
    }
}