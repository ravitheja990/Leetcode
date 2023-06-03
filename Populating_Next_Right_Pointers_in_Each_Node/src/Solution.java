import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node connect(Node root) {
        if(root == null) return root;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            for(int i=0;i<size;i++) {
                Node node = queue.remove();
                node.next = prev;
                prev = node;

                if(node.right != null) queue.add(node.right);
                if(node.left != null) queue.add(node.left);

            }

        }

        return root;
    }
}
