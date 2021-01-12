/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0 || inorder.length == 0) return null;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < preorder.length; i++){
            m.put(inorder[i], i);
        }
        return dfs(m, 0, preorder.length, 0, preorder, inorder);
        // 先找root
    }
    public TreeNode dfs(HashMap<Integer, Integer> m, int preorderLeft, int preorderend, int inorderLeft, int[] preorder, int[] inorder){
        if (preorderLeft == preorderend) return null;
        int root = preorder[preorderLeft];
        int r = m.get(root);
        int len = r-inorderLeft;
        TreeNode node = new TreeNode(root);
   
        node.left = dfs(m, preorderLeft+1, preorderLeft+len+1, inorderLeft, preorder, inorder);
        node.right = dfs(m, preorderLeft+len+1, preorderend, r+1, preorder, inorder);
        return node;
    }
}
