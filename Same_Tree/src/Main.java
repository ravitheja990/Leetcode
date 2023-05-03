public class Main {
    public static void main(String[] args) {
        TreeNode tree1Node1 = new TreeNode(1);
        TreeNode tree1Node2 = new TreeNode(2);
        TreeNode tree1Node3 = new TreeNode(3);

        tree1Node1.left = tree1Node2;
        tree1Node1.right = tree1Node3;

        TreeNode tree2Node1 = new TreeNode(1);
        TreeNode tree2Node2 = new TreeNode(2);
        TreeNode tree2Node3 = new TreeNode(3);

        tree2Node1.left = tree2Node2;
        tree2Node1.right = tree2Node3;

        Solution solution = new Solution();
        System.out.println("are given two trees same :: " + solution.isSameTree(tree1Node1, tree2Node1));
    }
}