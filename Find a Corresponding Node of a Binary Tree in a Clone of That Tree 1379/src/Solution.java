public class Solution {
    public TreeNode getTargetCopy(TreeNode original, TreeNode cloned, TreeNode target) {
        if(original == null || cloned == null || target == null) {
            return null;
        }
        return dfs(cloned, target);
    }

    private TreeNode dfs(TreeNode cloned, TreeNode target) {
        if(cloned == null) {
            return null;
        }
        if(cloned == target) {
            return cloned;
        }
        TreeNode left = dfs(cloned.left, target);
        TreeNode right = dfs(cloned.right, target);
        return (left != null) ? left: right;
    }
}