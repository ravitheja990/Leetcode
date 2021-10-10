class Solution {
    public int maxCoins(int[] balloons) {
        if(balloons == null || balloons.length < 1) {
            return 0;
        }
        
        int n = balloons.length;
        int[][] dp = new int[n][n];
        
        for(int gap=0;gap<n;gap++) {
            for(int i=0,j=gap;j<n;i++,j++) {
                int max = Integer.MIN_VALUE;
                for(int k=i;k<=j;k++) {
                    int left = (k == i) ? 0 : dp[i][k-1];
                    int right = (k == j) ? 0 : dp[k+1][j];
                    int val = (i == 0 ? 1 : balloons[i-1]) * balloons[k] * (j == n-1 ? 1 : balloons[j+1]);
                    max = Math.max(max, left+right+val);
                }
                dp[i][j] = max;   
            }   
        }
        
        return dp[0][n-1];
    }
}
