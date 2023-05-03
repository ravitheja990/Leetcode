public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        Solution solution = new Solution();
        System.out.println("tilt value of given tree is :: " + solution.findTilt(node1));
    }
}