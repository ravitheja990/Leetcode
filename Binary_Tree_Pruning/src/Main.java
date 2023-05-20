import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(1);

        node1.right = node2;
        node2.left = node3;
        node2.right = node4;

        Solution solution = new Solution();
        List<Integer> inorder = new ArrayList<>();
        node1 = solution.pruneTree(node1);
        inorder(node1, inorder);
        System.out.println("inorder of prunetree of given tree is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}