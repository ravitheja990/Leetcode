public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length-1);
    }

    private TreeNode constructTree(int[] nums, int start, int end) {
        int maxIndex = getMaxIndex(nums, start, end);
        if(maxIndex == -1) return null;
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left =  constructTree(nums, start, maxIndex-1);
        root.right = constructTree(nums, maxIndex+1, end);

        return root;
    }

    private int getMaxIndex(int[] nums, int start, int end) {
        int maxIndex = -1;
        int maxVal = -1;
        while(start <= end) {
            if(nums[start] > maxVal) {
                maxIndex = start;
                maxVal = nums[start];
            }
            start++;
        }

        return maxIndex;
    }
}
