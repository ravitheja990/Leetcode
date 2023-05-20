public class Solution {
    public int goodNode(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int max) {
        if(node == null) return 0;

        max = Math.max(max, node.val);

        if(node.val >= max) {
            return 1 + dfs(node.left, max) + dfs(node.right, max);
        }

        return dfs(node.left, max) + dfs(node.right, max);
    }
}
