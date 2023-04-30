import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
                    4
                  /   \
                 2     7            inorder = [1, 2, 3, 4, 6, 7, 9]
                / \   / \
               1   3 6   9

                    ==>

                    4
                  /   \
                 7     2            inorder = [9, 7, 6, 4, 3, 2, 1]
                / \   / \
               9   6 3   1
         */
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        Solution solution = new Solution();
        TreeNode root = solution.invertTree(node1);
        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        System.out.println("inorder of output is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}