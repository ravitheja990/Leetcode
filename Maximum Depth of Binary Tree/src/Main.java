public class Main {
    public static void main(String[] args) {
        /*
               3
              / \
             9  20
               /  \
              15   7
         */

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        Solution solution = new Solution();
        System.out.println("maxDepth of above tree is :: " + solution.maxDepth(node1));
    }
}