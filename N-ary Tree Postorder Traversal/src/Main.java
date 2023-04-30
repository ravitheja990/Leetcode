import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
                        1
                     /  |  \
                    3   2   4
                  /  \
                 5    6
         */
        Node node1 = new Node(1, new ArrayList<>());
        Node node2 = new Node(3, new ArrayList<>());
        Node node3 = new Node(2, new ArrayList<>());
        Node node4 = new Node(4, new ArrayList<>());
        Node node5 = new Node(5, new ArrayList<>());
        Node node6 = new Node(6, new ArrayList<>());
        List<Node> node1Children = new ArrayList<>();
        node1Children.add(node2);
        node1Children.add(node3);
        node1Children.add(node4);
        node1.children = node1Children;
        List<Node> node2Children = new ArrayList<>();
        node2Children.add(node5);
        node2Children.add(node6);
        node2.children = node2Children;

        Solution solution = new Solution();
        List<Integer> nAryPostOrder = solution.postorder(node1);
        System.out.println("nAryPostOrder is :: " + nAryPostOrder);
    }
}