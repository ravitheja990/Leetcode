import java.util.List;

public class Node {
    int val;
    List<Node> children;

    Node() {

    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

}
