public class Main {
    public static void main(String[] args) {
        TreeNode originalNode1 = new TreeNode(7);
        TreeNode originalNode2 = new TreeNode(4);
        TreeNode originalNode3 = new TreeNode(3);
        TreeNode originalNode4 = new TreeNode(6);
        TreeNode originalNode5 = new TreeNode(19);
        originalNode1.left = originalNode2;
        originalNode1.right = originalNode3;
        originalNode3.left = originalNode4;
        originalNode3.right = originalNode5;

        TreeNode clonedNode1 = new TreeNode(7);
        TreeNode clonedNode2 = new TreeNode(4);
        TreeNode clonedNode3 = new TreeNode(3);
        TreeNode clonedNode4 = new TreeNode(6);
        TreeNode clonedNode5 = new TreeNode(19);
        clonedNode1.left = clonedNode2;
        clonedNode1.right = clonedNode3;
        clonedNode3.left = clonedNode4;
        clonedNode3.right = clonedNode5;

        Solution solution = new Solution();
        TreeNode node = solution.getTargetCopy(originalNode1, clonedNode1, clonedNode3);
        System.out.println("node.val is :: "+ node.val);
    }
}