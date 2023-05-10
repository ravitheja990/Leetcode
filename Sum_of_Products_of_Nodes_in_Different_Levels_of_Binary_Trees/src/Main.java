public class Main {
    public static void main(String[] args) {
        TreeNode tree1Node1 = new TreeNode(1);
        TreeNode tree1Node2 = new TreeNode(2);
        TreeNode tree1Node3 = new TreeNode(3);
        TreeNode tree2Node1 = new TreeNode(4);
        TreeNode tree2Node2 = new TreeNode(5);
        TreeNode tree2Node3 = new TreeNode(6);

        tree1Node1.right = tree1Node2;
        tree1Node2.right = tree1Node3;
        tree2Node1.left = tree2Node2;
        tree2Node1.right = tree2Node3;

        Solution solution = new Solution();
        System.out.println("Sum of products of nodes in different levels of two binary trees is :: "
                + solution.sumOfProductPairs(tree1Node1, tree2Node1));
    }
}