import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(21);
        TreeNode node7 = new TreeNode(34);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        Solution solution = new Solution();
        List<Integer> inorder = new ArrayList<>();
        inorder(solution.reverseOddLevels(node1), inorder);
        System.out.println("inorder of reverse of odd levels is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}