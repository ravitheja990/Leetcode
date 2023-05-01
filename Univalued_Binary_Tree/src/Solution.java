public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return checkTree(root, root.val);
    }

    private boolean checkTree(TreeNode node, int val) {
        if(node == null) return true;
        if(node.val != val) return false;
        boolean left = checkTree(node.left, val);
        boolean right = checkTree(node.right, val);
        return ( left && (left == right) );
    }
}
