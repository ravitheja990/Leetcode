/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    int kthSmallestElement = -1;
    
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return kthSmallestElement;
    }
    
    private void inorder(TreeNode node, int k) {
        if(node == null || kthSmallestElement != -1) {
            return;
        }
        inorder(node.left, k);
        count++;
        if(count == k) {
            kthSmallestElement = node.val;
            return;
        }
        inorder(node.right, k);
    }
    
    /*
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) {
            return -1;
        }
        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);    
        return inorder.get(k-1);
    }
    
     private void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) {
            return;
        }
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
    */
}
