public class Solution {
    public int countNegatives(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int negativeCount = 0;
        for(int[] row: grid) {
            negativeCount += countNegativesInRow(row);
        }
        return negativeCount;
    }
    private int countNegativesInRow(int[] row) {
        int n = row.length;
        int pivotIndex = 0;
        int start = 0;
        int end = n-1;

        if(row[start] < 0) return n;
        if(row[end] >= 0) return 0;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(row[mid] < 0) {
                pivotIndex = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return n - pivotIndex;
    }
}
