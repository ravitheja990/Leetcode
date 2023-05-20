public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;

        Solution solution = new Solution();
        System.out.println("number of good nodes in given tree is :: " + solution.goodNode(node1));
    }
}