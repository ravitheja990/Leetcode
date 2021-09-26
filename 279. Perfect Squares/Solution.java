class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=2;i<=n;i++) {
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++) {
                int rem = i-j*j;
                min = Math.min(min, dp[rem]);
            }
            dp[i] = 1 + min;
        }
        
        return dp[n];
        // int dp[] = new int[n+1];
        // return rec(n, dp);
    }
    
    private int rec(int n, int dp[]) {
        if(n < 0) return Integer.MAX_VALUE;
        if(n == 0) return 0;
        if(dp[n] > 0) return dp[n];
        int min = n;
        for(int i=1;i*i<=n;i++) {
            min = Math.min(min, rec(n - i*i, dp));
        }
        dp[n] = min + 1;
        return min+1;
    }
}
