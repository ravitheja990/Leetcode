public class Main {
    public static void main(String[] args) {
        /*
                1
                 \
                  2
                 /
                3
         */

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.right = node2;
        node2.left = node3;

        Solution solution = new Solution();
        System.out.println("inorder is :: " + solution.inorder(node1));
    }
}