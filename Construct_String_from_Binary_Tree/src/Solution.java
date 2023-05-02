public class Solution {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        constructTree(root);
        return sb.toString();
    }
    private void constructTree(TreeNode node) {
        if(node == null) return;
        sb.append(node.val);
        if(node.left == null && node.right == null) return;
        sb.append("(");
        constructTree(node.left);
        sb.append(")");
        if(node.right != null) {
            sb.append("(");
            constructTree(node.right);
            sb.append(")");
        }
    }
}
