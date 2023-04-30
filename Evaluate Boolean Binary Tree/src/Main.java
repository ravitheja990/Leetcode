public class Main {
    public static void main(String[] args) {
        /*
               2
              / \
             1   3
                / \
               0   1
         */
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        Solution solution = new Solution();
        System.out.println("evaluation result is :: " + solution.evaluateTree(node1));
    }
}