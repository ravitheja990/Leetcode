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
class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        partialInorder(root);
    }
    
    public int next() {
        TreeNode topEle = stack.pop();
        partialInorder(topEle.right);
        return topEle.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    private void partialInorder(TreeNode node) {
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
    }
    
}



// class BSTIterator {
//     List<Integer> inorder = new ArrayList<>();
//     public BSTIterator(TreeNode root) {
//         inorder(root, inorder);
//     }
    
//     public int next() {
//         return inorder.remove(0);
//     }
    
//     public boolean hasNext() {
//         return !inorder.isEmpty();
//     }
    
//     private void inorder(TreeNode node, List<Integer> inorder) {
//         if(node == null) {
//             return;
//         }
//         inorder(node.left, inorder);
//         inorder.add(node.val);
//         inorder(node.right, inorder);
//     }
    
// }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
