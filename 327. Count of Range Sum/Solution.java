class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        long sums[] = new long[n+1];
        for(int i=1;i<=n;i++) {
            sums[i] = sums[i-1] + nums[i-1];
        }
        
        return mergeSortCountRangeSum(sums, lower, upper, 0, n);
    }
    
    private int mergeSortCountRangeSum(long sums[], int lower, int upper, int low, int high) {
        if(low >= high) {
            return 0;
        }
        int mid = low + (high-low)/2;
        int res = mergeSortCountRangeSum(sums, lower, upper, low, mid) + mergeSortCountRangeSum(sums, lower, upper, mid+1, high);
        int i = mid+1;
        int j = mid+1;
        for(int k=low;k<=mid;k++) {
            while(i <= high && sums[i]-sums[k] < lower) {
                i++;
            }
            while(j <= high && sums[j]-sums[k] <= upper){
                j++;
            }
            res = res + j-i;
        }
        mergeCountRangeSum(sums, low, high);
        return res;
    }
    
    private void mergeCountRangeSum(long sums[], int low, int high) {
        int mid = low + (high-low)/2;
        int i=low;
        int j=mid+1;
        int k=0;
        long arr[] = new long[high-low+1];
        while(k < arr.length) {
            long num1 = (i <= mid) ? sums[i] : Long.MAX_VALUE;
            long num2 = (j <= high) ? sums[j] : Long.MAX_VALUE;
            arr[k++] = (num1 <= num2) ? sums[i++] : sums[j++];
        }
        for(int p=0;p<arr.length;p++) {
            sums[p+low] = arr[p];
        }
    }
    
}
