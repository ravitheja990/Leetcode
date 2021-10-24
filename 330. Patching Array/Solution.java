class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0;
        int i = 0;
        long reach = 0;
        
        while(reach < n) {
            if(i >= nums.length) {
                reach = reach + (reach + 1);
                count++;
            }else if(nums[i] <= (reach+1)) {
                reach = reach + nums[i];
                i++;
            }else {
                reach = reach + (reach + 1);
                count++;
            }
        }
        
        return count;
    }
}
