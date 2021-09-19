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
        List<String> allRootToLeafPaths = new ArrayList<>();
        dfs(root, "", allRootToLeafPaths);
        return allRootToLeafPaths;
    }
    private void dfs(TreeNode node, String eachPath, List<String> allRootToLeafPaths) {
        eachPath += node.val;
        if(node.left == null && node.right == null) {
            allRootToLeafPaths.add(eachPath);
            return;
        }
        if(node.left != null)
            dfs(node.left, eachPath + "->", allRootToLeafPaths);
        if(node.right != null)
            dfs(node.right, eachPath + "->", allRootToLeafPaths);
    }
}
