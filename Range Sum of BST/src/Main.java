public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(18);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        Solution solution = new Solution();
        int sum = solution.rangeSumBST(node1, 7, 15);
        System.out.println("sum is :: " + sum);
    }
}