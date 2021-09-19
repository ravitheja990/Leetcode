class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> indexList = new LinkedList<>();
        List<Integer> output = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++) {
            while(!indexList.isEmpty() && indexList.getFirst() <= i-k)
                indexList.removeFirst();
            while(!indexList.isEmpty() && nums[i] >= nums[indexList.getLast()])
                indexList.removeLast();
            indexList.addLast(i);
            if(i >= k-1)
                output.add(nums[indexList.getFirst()]);
        }
        
        return output.stream().mapToInt(a->a).toArray();
    }
}
