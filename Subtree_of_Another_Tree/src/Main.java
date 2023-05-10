public class Main {
    public static void main(String[] args) {
        TreeNode rootNode1 = new TreeNode(3);
        TreeNode rootNode2 = new TreeNode(4);
        TreeNode rootNode3 = new TreeNode(5);
        TreeNode rootNode4 = new TreeNode(1);
        TreeNode rootNode5 = new TreeNode(2);

        rootNode1.left = rootNode2;
        rootNode1.right = rootNode3;
        rootNode2.left = rootNode4;
        rootNode2.right = rootNode5;

        TreeNode subRootNode1 = new TreeNode(4);
        TreeNode subRootNode2 = new TreeNode(1);
        TreeNode subRootNode3 = new TreeNode(2);

        subRootNode1.left = subRootNode2;
        subRootNode1.right = subRootNode3;

        Solution solution = new Solution();
        System.out.println("is subRoot subtree of root tree :: " + solution.isSubtree(rootNode1, subRootNode1));
    }
}