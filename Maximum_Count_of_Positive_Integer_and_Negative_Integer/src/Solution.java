public class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int posIdx = -1;
        int negIdx = -1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] < 0) {
                negIdx = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        start = 0;
        end = n-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > 0) {
                posIdx = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        if(posIdx == -1 && negIdx == -1) return 0;
        else if(posIdx == -1) return negIdx+1;

        return Math.max(negIdx+1, n-posIdx);
    }
}
