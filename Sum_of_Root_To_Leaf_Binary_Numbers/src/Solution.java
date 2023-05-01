public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return preorder(root, 0);
    }
    private int preorder(TreeNode node, int sum) {
        if(node == null) return 0;
        sum = 2*sum + node.val;
        if(node.left == null && node.right == null) return sum;
        return preorder(node.left, sum) + preorder(node.right, sum);
    }
}
