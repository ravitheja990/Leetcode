public class Solution {
    int tiltVal = 0;
    public int findTilt(TreeNode root) {
        tiltTree(root);
        return tiltVal;
    }

    private int tiltTree(TreeNode node) {
        if(node == null) return 0;
        int leftVal = tiltTree(node.left);
        int rightVal = tiltTree(node.right);
        tiltVal += Math.abs(leftVal - rightVal);
        return leftVal + rightVal + node.val;
    }
}
