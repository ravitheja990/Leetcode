import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        nAryPreOrder(root, preOrder);
        return preOrder;
    }

    private void nAryPreOrder(Node node, List<Integer> preOrder) {
        if(node == null) return;
        preOrder.add(node.val);
        for(Node child: node.children) {
            nAryPreOrder(child, preOrder);
        }
    }

}
