public class Solution {
    int minVal = Integer.MAX_VALUE;
    int secMinVal = Integer.MAX_VALUE;
    boolean isSecMinSet = false;

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        dfs(root);
        return isSecMinSet? secMinVal: -1;
    }
    private void dfs(TreeNode node) {
        if(node == null) return;
        int currVal = node.val;
        if(currVal < minVal) {
            minVal = currVal;
        }else if(currVal > minVal && currVal <= secMinVal) {
            secMinVal = currVal;
            isSecMinSet = true;
        }
        dfs(node.left);
        dfs(node.right);
    }
}