class Solution {
    int directions[][] = {{-1,0},{1,0},{0,1},{0,-1}};
    
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int longestIncreasingPath = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int memo[][] = new int[m][n];
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                longestIncreasingPath = Math.max(longestIncreasingPath, dfs(matrix, i, j, memo));
            }
        }
        
        return longestIncreasingPath;
    }
    
    private int dfs(int matrix[][], int i, int j, int memo[][]) {
        if(memo[i][j] > 0) {
            return memo[i][j];
        }
        int m = matrix.length;
        int n = matrix[i].length;
        int max = 0;
        
        for(int dir[]: directions) {
            int x = i+dir[0];
            int y = j+dir[1];
            if(x >=0 && y >= 0 && x < m && y < n && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, dfs(matrix, x, y, memo));
            }
        }        
        memo[i][j] = max+1;
        
        return max+1;
    }
    
}
