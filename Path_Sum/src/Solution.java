public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return hasTargetSum(root, targetSum, 0);
    }

    private boolean hasTargetSum(TreeNode node, int targetSum, int sum) {
        if(node == null) return false;
        sum = sum + node.val;
        if(node.left == null && node.right == null) return targetSum == sum;
        return hasTargetSum(node.left, targetSum, sum) || hasTargetSum(node.right, targetSum, sum);
    }
}
