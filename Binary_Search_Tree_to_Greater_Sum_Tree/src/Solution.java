import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return null;
        List<TreeNode> inorder = new ArrayList<>();
        inorder(root, inorder);
        postFixSum(root, inorder);
        return root;
    }

    private void inorder(TreeNode node, List<TreeNode> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node);
        inorder(node.right, inorder);
    }

    private void postFixSum(TreeNode node, List<TreeNode> inorder) {
        if(node == null) return;
        int n = inorder.size();
        for(int i=n-2;i>=0;i--) {
            inorder.get(i).val = inorder.get(i).val + inorder.get(i+1).val;
        }
    }
}
