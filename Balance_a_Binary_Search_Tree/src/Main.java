public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.right = node2;
        node2.right = node3;
        node3.right = node4;

        Solution solution = new Solution();
        System.out.println("root of balanced binary search tree is :: " + solution.balanceBST(node1).val);


    }
}