class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return output;
        }
        int n = nums.length;
        
        for(int i=0;i<n;i++) {
            int start = nums[i];
            while(i+1 < n && nums[i+1] - nums[i] == 1) {
                i++;
            }
            if(nums[i] == start) {
                output.add("" + start);
            }else {
                output.add("" + start + "->" + nums[i]);
            }
        }
        
        return output;
    }
}
