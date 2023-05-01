public class Solution {
    public TreeNode sortedArrayBST(int[] nums) {
        int size = nums.length;
        return generateBST(nums, 0, size-1);
    }
    private TreeNode generateBST(int[] nums, int start, int end) {
        if(start > end) return null;
        int mid = start + (end-start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = generateBST(nums, start, mid-1);
        node.right = generateBST(nums, mid+1, end);
        return node;
    }
}
