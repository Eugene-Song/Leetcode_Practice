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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(0, root, list);
        return list;

    }

    public void dfs(int depth, TreeNode node, List<Integer> list){            if (node == null){
        return;
    }
                  if (depth == list.size()){
        list.add(node.val);
    }
    depth++;
    dfs(depth, node.right, list);
    dfs(depth, node.left, list);
    }
}
