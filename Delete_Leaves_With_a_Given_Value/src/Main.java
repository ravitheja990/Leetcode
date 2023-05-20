import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;

        Solution solution = new Solution();
        node1 = solution.removeLeafNodes(node1, 2);
        List<Integer> inorder = new ArrayList<>();
        inorder(node1, inorder);
        System.out.println("inorder of output tree is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}