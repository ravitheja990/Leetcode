public class Solution {
    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        if(root == null) return count;
        postOrder(root);
        return count;
    }

    private int[] postOrder(TreeNode node) {
        if(node == null) return new int[]{0,0};

        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);

        int totalSum = left[0] + right[0] + node.val;
        int totalNodes = left[1] + right[1] + 1;
        int average = totalSum/totalNodes;

        if(average == node.val) count++;

        return new int[]{totalSum, totalNodes};
    }
}
