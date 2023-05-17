public class Main {
    public static void main(String[] args) {
        TreeNode tree1Node1 = new TreeNode(1);
        TreeNode tree1Node2 = new TreeNode(2);
        TreeNode tree1Node3 = new TreeNode(4);

        tree1Node2.left = tree1Node1;
        tree1Node2.right = tree1Node3;

        TreeNode tree2Node1 = new TreeNode(0);
        TreeNode tree2Node2 = new TreeNode(1);
        TreeNode tree2Node3 = new TreeNode(3);

        tree2Node2.left = tree2Node1;
        tree2Node2.right = tree2Node3;

        Solution solution = new Solution();
        System.out.println("all elements of both bsts in sorted order are :: " + solution.getAllElements(tree1Node2, tree2Node2));

    }
}