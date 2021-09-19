class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int r = 0, c = n-1;
        
        while(c >= 0 && r < m) {
            if(matrix[r][c] == target) return true;
            if(matrix[r][c] < target) 
                r++;
            else 
                c--;
        }
        
        return false;
    }
}
