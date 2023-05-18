public class Solution {
    private int maxDiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        if(root == null) return 0;
        findMaxDiff(root, root.val, root.val);
        return maxDiff;
    }

    private void findMaxDiff(TreeNode node, int max, int min) {
        if(node == null) return;

        maxDiff = Math.max(maxDiff, Math.abs(max - node.val));
        maxDiff = Math.max(maxDiff, Math.abs(node.val - min));

        if(node.left != null){
            findMaxDiff(node.left, Math.max(node.left.val, max), Math.min(node.left.val, min));
        }

        if(node.right != null){
            findMaxDiff(node.right, Math.max(node.right.val, max), Math.min(node.right.val, min));
        }
    }
}
