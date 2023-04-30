public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null &&  root.right == null) {
            if(root.val == 0)
                return false;
            return true;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if(root.val == 2)
            return left || right;

        return left && right;
    }
}
