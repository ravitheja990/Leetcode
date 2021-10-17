class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> countsList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        if(nums == null || nums.length == 0) return countsList;
        int n = nums.length;
        
        for(int i=n-1;i>=0;i--) {
            if(sortedList.isEmpty()) {
                sortedList.add(nums[i]);
                countsList.add(0);
            }else if(nums[i] > sortedList.get(sortedList.size()-1)) {
                sortedList.add(nums[i]);
                countsList.add(sortedList.size()-1);
            }else {
                int low = 0;
                int high = sortedList.size()-1;
                
                while(low < high) {
                    int mid = low + (high - low)/2;
                    if(nums[i] > sortedList.get(mid)) {
                        low = mid + 1;
                    }else {
                        high = mid;
                    }
                }
                sortedList.add(high, nums[i]);
                countsList.add(high);
            }
        }
        Collections.reverse(countsList);
        return countsList;
    }
}
