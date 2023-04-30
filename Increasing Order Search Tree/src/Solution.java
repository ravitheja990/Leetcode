import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        return generateInorderTree(inorder);
    }

    private void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }

    private TreeNode generateInorderTree(List<Integer> inorder) {
        int index = 0;
        int size = inorder.size();
        TreeNode root = new TreeNode(inorder.get(index++));
        TreeNode temp = root;
        while(index < size) {
            temp.right = new TreeNode(inorder.get(index));
            temp = temp.right;
            index++;
        }
        return root;
    }
}
