在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。

如果二叉树的两个节点深度相同，但 父节点不同 ，则它们是一对堂兄弟节点。

我们给出了具有唯一值的二叉树的根节点 root ，以及树中两个不同节点的值 x 和 y 。

只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true 。否则，返回 fals


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
        // x 的信息
    int x;
    TreeNode xParent;
    int xDepth;
    boolean xFound = false;

    // y 的信息
    int y;
    TreeNode yParent;
    int yDepth;
    boolean yFound = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        int depth = 0;
        this.x = x;
        this.y = y;
        dfs(root,depth,null);
 
        if (xDepth == yDepth && xParent != yParent){
            return true;
        }
        return false;

    }
    public void dfs(TreeNode root, int depth, TreeNode p ){
        if (root == null){
            return;
        }
        
        if (root.val == x){
            xDepth = depth;
            xParent = p;
            xFound = true;
        }
        if (root.val == y){
            yDepth = depth;
            yParent = p;
            yFound = true;
        }
        if (xFound && yFound){
            return;
        }
        dfs(root.left,depth+1,root);
        if (xFound && yFound){
            return;
        }
        dfs(root.right,depth+1,root);
    }
}
