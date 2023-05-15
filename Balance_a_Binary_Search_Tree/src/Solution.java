import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        return constructTree(inorder, 0, inorder.size()-1);
    }

    private TreeNode constructTree(List<Integer> inorder, int start, int end) {
        if(start > end) return null;

        int mid = start + (end-start)/2;
        int val = inorder.get(mid);
        TreeNode root = new TreeNode(val);
        root.left = constructTree(inorder, start, mid-1);
        root.right = constructTree(inorder, mid+1, end);

        return root;
    }
    private void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}
