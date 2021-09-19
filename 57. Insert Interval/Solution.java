class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> mergedList = new LinkedList<>();
        
        for(int[] interval: intervals) {
            if(interval[1] < newInterval[0]) {
                mergedList.add(interval);
            }else if(newInterval[1] < interval[0]) {
                mergedList.add(newInterval);
                newInterval = interval;
            }else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        mergedList.add(newInterval);
        
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
