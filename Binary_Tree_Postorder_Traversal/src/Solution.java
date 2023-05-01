import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        postOrder(root, postOrder);
        return postOrder;
    }

    private void postOrder(TreeNode node, List<Integer> postOrder) {
        if(node == null) return;
        postOrder(node.left, postOrder);
        postOrder(node.right, postOrder);
        postOrder.add(node.val);
    }
}
