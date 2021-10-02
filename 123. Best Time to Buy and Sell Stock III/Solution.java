class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        
        int n = prices.length;
        int mpist = 0;
        int minSoFar = prices[0];
        int dpLeft[] = new int[n];
        
        for(int i=1;i<n;i++) {
            mpist = prices[i] - minSoFar;
            dpLeft[i] = Math.max(mpist, dpLeft[i-1]);
            minSoFar = Math.min(minSoFar, prices[i]);
        }
        
        int mpibt = 0;
        int maxAfterToday = prices[n-1];
        int dpRight[] = new int[n];
        
        for(int i=n-2;i>=0;i--) {
            mpibt = maxAfterToday - prices[i];
            dpRight[i] = Math.max(mpibt, dpRight[i+1]);            
            maxAfterToday = Math.max(maxAfterToday, prices[i]);
        }
        
        int maxProfit = 0;
        
        for(int i=0;i<n;i++) {
            maxProfit = Math.max(maxProfit, dpLeft[i]+dpRight[i]);
        }
        
        return maxProfit;
    }
    
//     private int maxProfitInGivenRange(int[] prices, int i, int j) {
//         int maxProfit = 0;
//         int minSoFar = prices[i];
        
//         for(int k=i+1;k<=j;k++) {
//             maxProfit = Math.max(maxProfit, prices[k]-minSoFar);
//             minSoFar = Math.min(minSoFar, prices[k]);
//         }
        
//         return maxProfit;
//     }
    
}
