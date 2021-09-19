class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int numOfIslands = 0;
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    numOfIslands++;
                }
            }
        }
        
        return numOfIslands;
    }
    
    private void dfs(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[i].length-1 || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
