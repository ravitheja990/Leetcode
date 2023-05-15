public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructTree(preorder, 0, preorder.length);
    }

    private TreeNode constructTree(int[] preorder, int start, int end) {
        if(start >= end) return null;

        int val = preorder[start];
        TreeNode root = new TreeNode(val);
        int i = start+1;

        while(i < preorder.length && preorder[i] < val) i++;

        root.left = constructTree(preorder, start+1, i);
        root.right = constructTree(preorder, i, end);

        return root;
    }
}
