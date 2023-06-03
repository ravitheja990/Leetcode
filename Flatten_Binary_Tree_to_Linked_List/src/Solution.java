class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                // Find the rightmost node of the left subtree
                TreeNode rightmost = current.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }

                // Move the right subtree of current to the rightmost node of the left subtree
                rightmost.right = current.right;

                // Replace the right subtree of current with the left subtree
                current.right = current.left;
                current.left = null;
            }

            // Move to the next node in the flattened list
            current = current.right;
        }
    }
}