import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode tree1Node1 = new TreeNode(1);
        TreeNode tree1Node2 = new TreeNode(3);
        TreeNode tree1Node3 = new TreeNode(2);
        TreeNode tree1Node4 = new TreeNode(5);

        tree1Node1.left = tree1Node2;
        tree1Node1.right = tree1Node3;
        tree1Node2.left = tree1Node4;

        TreeNode tree2Node1 = new TreeNode(2);
        TreeNode tree2Node2 = new TreeNode(1);
        TreeNode tree2Node3 = new TreeNode(3);
        TreeNode tree2Node4 = new TreeNode(4);
        TreeNode tree2Node5 = new TreeNode(7);

        tree2Node1.left = tree2Node2;
        tree2Node1.right = tree2Node3;
        tree2Node2.right = tree2Node4;
        tree2Node3.right = tree2Node5;

        Solution solution = new Solution();
        TreeNode root = solution.mergeTrees(tree1Node1, tree2Node1);
        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        System.out.println("inorder is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) {
            return;
        }
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}