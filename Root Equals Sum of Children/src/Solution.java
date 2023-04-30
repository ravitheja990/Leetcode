public class Solution {
    public boolean checkTree(TreeNode root) {
        int rootVal = (root != null)? root.val: 0;
        int leftVal = (root != null && root.left != null)? root.left.val: 0;
        int rightVal = (root != null && root.right != null)? root.right.val: 0;
        return (rootVal == (leftVal + rightVal));
    }
}
