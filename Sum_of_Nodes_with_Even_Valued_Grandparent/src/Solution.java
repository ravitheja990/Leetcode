public class Solution {
    private int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root);
        return sum;
    }
    private void dfs(TreeNode node) {
        if(node == null) return;
        int currVal = node.val;
        if(currVal % 2 == 0) {
            if(node.left != null) {
                if(node.left.left != null) {
                    sum += node.left.left.val;
                }
                if(node.left.right != null) {
                    sum += node.left.right.val;
                }
            }
            if(node.right != null) {
                if(node.right.left != null) {
                    sum += node.right.left.val;
                }
                if(node.right.right != null) {
                    sum += node.right.right.val;
                }
            }
        }
        dfs(node.left);
        dfs(node.right);
    }
}
