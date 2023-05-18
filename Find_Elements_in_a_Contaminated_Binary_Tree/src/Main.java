public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-1);
        TreeNode node3 = new TreeNode(-1);
        TreeNode node4 = new TreeNode(-1);
        TreeNode node5 = new TreeNode(-1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        Solution solution = new Solution(node1);
        System.out.println("is 1 present in recovered tree :: " + solution.find(1));
        System.out.println("is 3 present in recovered tree :: " + solution.find(3));
        System.out.println("is 5 present in recovered tree :: " + solution.find(5));
    }
}