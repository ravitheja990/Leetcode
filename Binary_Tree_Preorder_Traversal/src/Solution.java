import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        preOrder(root, preOrder);
        return preOrder;
    }
    private void preOrder(TreeNode node, List<Integer> preOrder) {
        if(node == null) return;
        preOrder.add(node.val);
        preOrder(node.left, preOrder);
        preOrder(node.right, preOrder);
    }
}
