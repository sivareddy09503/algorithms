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
 //Binary Tree Zigzag Level Order Traversal
 //TC: O(n), SC:O(n)
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null) return traversal;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            List<Integer> levelOrder = new ArrayList<>();
            int size = queue.size();
            while(size != 0) {
                TreeNode tmp = queue.poll();
                if(level % 2 == 0) levelOrder.add(tmp.val);
                if(level % 2 == 1) levelOrder.add(0,tmp.val);
                if(tmp.left != null) queue.add(tmp.left);
                if(tmp.right != null) queue.add(tmp.right);
                size--;
            }
            level++;
            traversal.add(levelOrder);
        }
        return traversal;
    }
}