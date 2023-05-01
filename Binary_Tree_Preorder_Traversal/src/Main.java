public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.right = node2;
        node2.left = node3;

        Solution solution = new Solution();
        System.out.println("preOrder traversal of given tree is :: " + solution.preOrderTraversal(node1));
    }
}