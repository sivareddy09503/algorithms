//Leaf similar trees
//T:O(n^2), SC:O(n)
/*Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        DFS(root1, list1);
        DFS(root2, list2);
        if(list1.size() != list2.size()) return false;
        for(int i=0;i<list1.size();i++) {
            if(list1.get(i) != list2.get(i)) return false;
        }
        return true;
    }
    public void DFS(TreeNode root, List<Integer> list) {
        if(root==null) return;
        if(root.left == null && root.right==null) {
            list.add(root.val);
            return;
        }
        DFS(root.left,list);
        DFS(root.right,list);
    }
}