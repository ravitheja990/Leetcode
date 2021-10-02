class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        
        int n = prices.length;
        int dp[][] = new int[k+1][n];
        
        //(O^n3)
        // for(int t=1;t<=k;t++) {
        //     for(int d=1;d<n;d++) {
        //         int max = dp[t][d-1];
        //         for(int pd=0;pd<d;pd++) {
        //             int ptilltm1 = dp[t-1][pd];
        //             int ptth = prices[d]-prices[pd];
        //             max = Math.max(max, ptilltm1+ptth);
        //         }
        //         dp[t][d] = max;
        //     }
        // }
        
        //O(n^2)
        for(int t=1;t<=k;t++) {
            int max = Integer.MIN_VALUE;
            for(int d=1;d<n;d++) {
                max = Math.max(max, dp[t-1][d-1]-prices[d-1]);   
                if(max + prices[d] > dp[t][d-1]) {
                    dp[t][d] = max + prices[d];
                }else {
                    dp[t][d] = dp[t][d-1];
                }
            }
        }
        
        return dp[k][n-1];
    }
}
