class Solution {
    public void wiggleSort(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int i=1, j=n-1;
        int res[] = new int[n];
        for(i=1;i<n;i+=2, j--) {
            res[i] = nums[j];
        }
        for(i=0;i<n;i+=2, j--) {
            res[i] = nums[j];
        }
        for(i=0;i<n;i++) {
            nums[i] = res[i];
        }
    }
}
