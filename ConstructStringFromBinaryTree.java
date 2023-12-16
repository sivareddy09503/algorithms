//Construct string from binary tree
//TC:O(n), SC:O(n)
/*Input: root = [1,2,3,4]
Output: "1(2(4))(3)"
Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"*/
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
    public String tree2str(TreeNode root) {
        StringBuilder res = new StringBuilder();
        dfs(root,res);
        return res.toString();
    }
    public void dfs(TreeNode t, StringBuilder res) {
        if(t==null) return;
        res.append(String.valueOf(t.val));
        if(t.left==null && t.right==null) {
            return;
        }
        res.append('(');
        dfs(t.left,res);
        res.append(')');
        if(t.right!=null) {
            res.append('(');
            dfs(t.right,res);
            res.append(')');
        }
    }
}