class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        int n = prices.length;
        int obsp = -prices[0];
        int ossp = 0;
        
        for(int i=0;i<n;i++) {
            int nbsp = 0;
            int nssp = 0;
            
            if(ossp - prices[i] > obsp) {
                nbsp = ossp - prices[i];
            }else {
                nbsp = obsp;
            }
            
            if(obsp + prices[i] - fee > ossp) {
                nssp = obsp + prices[i] - fee;
            }else {
                nssp = ossp;
            }
            
            obsp = nbsp;
            ossp = nssp;
        }
        return ossp;
    }
}
