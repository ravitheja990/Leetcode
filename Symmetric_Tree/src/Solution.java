public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isChildValEqual(root.left, root.right);
    }

    private boolean isChildValEqual(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left != null && right == null) return false;
        if(left == null && right != null) return false;

        return (left.val == right.val) && (isChildValEqual(left.left, right.right))
                && (isChildValEqual(left.right, right.left));
    }

}
