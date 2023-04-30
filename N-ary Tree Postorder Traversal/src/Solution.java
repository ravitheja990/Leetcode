import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> postOrder = new ArrayList<>();
        nAryPostOrder(root, postOrder);
        return postOrder;
    }

    private void nAryPostOrder(Node node, List<Integer> postOrder) {
        if(node == null) return;
        for(Node child: node.children) {
            nAryPostOrder(child, postOrder);
        }
        postOrder.add(node.val);
    }
}
