class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        int leftMax = 0, rightMax = 0, totalTrappedWater = 0, maxIndex = 0;
        
        for(int i=0;i<n;i++) {
            if(heights[i] > rightMax) {
                rightMax = heights[i];
                maxIndex = i;
            }
        }
        for(int i=0;i<maxIndex;i++) {
            leftMax = Math.max(leftMax, heights[i]);
            int water = Math.min(leftMax, rightMax) - heights[i];
            totalTrappedWater += water;
        }
        leftMax = 0;
        for(int i=n-1;i>=maxIndex;i--) {
            leftMax = Math.max(leftMax, heights[i]);
            int water = Math.min(leftMax, rightMax) - heights[i];
            totalTrappedWater += water;
        }
        
        return totalTrappedWater;
    }
}
