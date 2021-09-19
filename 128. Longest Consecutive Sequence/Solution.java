class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Boolean> map = new HashMap<>();
        int maxCount = 1;
        
        for(int num: nums) {
            map.put(num, true);
        }
        
        for(int num: nums) {
            if(map.containsKey(num-1)) {
                map.put(num, false);
            }
        }
        
        for(int num: nums) {
            int eachCount = 1;
            if(map.get(num)) {
                while(map.containsKey(num+eachCount)) {
                    eachCount++;
                }
                maxCount = Math.max(eachCount, maxCount);
            }
        }
        
        
        return maxCount;
    }
}
