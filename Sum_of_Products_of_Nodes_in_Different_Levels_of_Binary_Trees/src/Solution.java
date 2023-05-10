public class Solution {
    public int sumOfProductPairs(TreeNode root1, TreeNode root2) {
        return productSum(root1, root2, 0);
    }
    private int productSum(TreeNode node1, TreeNode node2, int depth) {
        if(node1 == null || node2 == null) return 0;
        if(depth % 2 == 0) {
            return (node1.val * node2.val) + (productSum(node1.left, node2.right, depth+1))
                    + (productSum(node1.right, node2.left, depth+1));
        }else {
            return (productSum(node1.left, node2.left, depth+1))
                    + (productSum(node1.right, node2.right, depth+1));
        }
    }
}
