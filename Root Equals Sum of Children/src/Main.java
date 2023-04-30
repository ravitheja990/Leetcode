public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;

        Solution solution = new Solution();
        boolean rootEqualsSumOfChildren = solution.checkTree(node1);
        System.out.println("rootEqualsSumOfChildren is :: " + rootEqualsSumOfChildren);
    }
}