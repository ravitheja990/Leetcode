import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        int[] output = new int[m];
        int[] prefixSum = new int[n+1];

        for(int i=1;i<=n;i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }

        for(int i=0;i<m;i++) {
            output[i] = binarySearch(prefixSum, queries[i]);
        }

        return output;
    }

    private int binarySearch(int[] prefixSum, int query) {
        int start = 0;
        int end = prefixSum.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(prefixSum[mid] == query) return mid;
            else if(prefixSum[mid] > query) end = mid-1;
            else start = mid+1;
        }

        if(prefixSum[end] > query) return start;
        return end;
    }
}
