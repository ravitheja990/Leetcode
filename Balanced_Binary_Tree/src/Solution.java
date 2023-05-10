public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        if(Math.abs(left - right) > 1 || left == -1 || right == -1) return -1;
        return Math.max(left, right) + 1;
    }
}
