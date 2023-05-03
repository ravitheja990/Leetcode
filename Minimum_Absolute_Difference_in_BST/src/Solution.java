public class Solution {
    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;
        getMinimumDifference(root.left);
        if(prev != null) {
            minDiff = Math.min(minDiff, Math.abs(prev - root.val));
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return minDiff;
    }
}
