class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null) {
            return;
        }
        
        int rows = board.length;
        int cols = board[0].length;
        int dx[] = {1, 1, 1, 0, 0, -1, -1, -1};
        int dy[] = {-1, 0, 1, -1, 1, 1, 0, -1};
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                int liveNeighborCount = 0;
                for(int k=0;k<8;k++) {
                    int neighbori = i+dx[k];
                    int neighborj = j+dy[k];
                    if(isSafe(neighbori, neighborj, rows, cols) && Math.abs(board[neighbori][neighborj]) == 1) {
                        liveNeighborCount++;
                    }
                }
                
                if(board[i][j] == 0 && liveNeighborCount == 3)
                    board[i][j] = 2;
                if(board[i][j] == 1 && (liveNeighborCount < 2 || liveNeighborCount > 3))
                    board[i][j] = -1;
                    
            }
        }
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                board[i][j] = board[i][j] > 0 ? 1 : 0;
            }
        }
        
    }
    
    private boolean isSafe(int i, int j, int rows, int cols) {
        return (i >=0 && i < rows && j >= 0 && j < cols);
    }
    
//     private int countLiveNeighbors(int[][] board, int i, int j, int rows, int cols) {
//         int liveNeighborCount = 0;
        
//         if(i-1 >= 0 && Math.abs(board[i-1][j]) == 1) {
//             liveNeighborCount++;
//         }
//         if(i-1 >= 0 && j-1 >= 0 && Math.abs(board[i-1][j-1]) == 1) {
//             liveNeighborCount++;
//         }
//         if(i-1 >= 0 && j+1 < cols && Math.abs(board[i-1][j+1]) == 1) {
//             liveNeighborCount++;
//         }
//         if(j-1 >= 0 && Math.abs(board[i][j-1]) == 1) {
//             liveNeighborCount++;
//         }
//         if(j+1 < cols && Math.abs(board[i][j+1]) == 1) {
//             liveNeighborCount++;
//         }
//         if(i+1 < rows && Math.abs(board[i+1][j]) == 1) {
//             liveNeighborCount++;
//         }
//         if(i+1 < rows && j+1 < cols && Math.abs(board[i+1][j+1]) == 1) {
//             liveNeighborCount++;
//         }
//         if(i+1 < rows && j-1 >= 0 && Math.abs(board[i+1][j-1]) == 1) {
//             liveNeighborCount++;
//         }        
        
//         return liveNeighborCount;
//     }
    
}
