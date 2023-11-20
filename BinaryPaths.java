//Binary Tree Paths
//TC:O(n), SC:O(n)
//Input: root = [1,2,3,null,5]
//Output: ["1->2->5","1->3"]
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        findPath(root,"",list);
        return list;
    }
    public List<String> findPath(TreeNode root, String path, List<String> list) {
        if(root == null) {
            return list;
        }
        if(root.left==null && root.right==null) {
            list.add(path+root.val);
            return list;
        }
        findPath(root.left, (path+root.val+"->"),list);
        findPath(root.right, (path+root.val+"->"),list);
        return list;
    }
}