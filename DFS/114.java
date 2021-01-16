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
    public void flatten(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        dfs(root, l);
        TreeNode pre = root;
        for (int i = 1; i < l.size(); i++){
            TreeNode right = new TreeNode(l.get(i));
            pre.left = null;
            pre.right = right;
            pre = pre.right;
        }
    }
    public void dfs(TreeNode newRoot, List<Integer> list){
        if (newRoot != null){
            list.add(newRoot.val);
        }
        else{
            return;
        }
        dfs(newRoot.left, list);
        dfs(newRoot.right, list);
        
    }
}



