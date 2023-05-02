public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;

        Solution solution = new Solution();
        System.out.println("all binary tree paths for given tree are :: " + solution.binaryTreePaths(node1));
    }
}