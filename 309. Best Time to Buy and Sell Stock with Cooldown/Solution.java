class Solution {
    public int maxProfit(int[] prices) {
        Map<String, Integer> hm = new HashMap<>();
        return maxProfit(0, 0, prices, hm);
    }
    
    private int maxProfit(int i, int buyOrSell, int[] prices, Map<String, Integer> hm) {
        if(i >= prices.length) {
            return 0;
        }
        String key = i+"#"+buyOrSell;
        if(hm.containsKey(key)) {
            return hm.get(key);
        }
        
        int maxProfit = 0;
        if(buyOrSell == 0) {
            int buy = maxProfit(i+1, 1, prices, hm) - prices[i];
            int noBuy = maxProfit(i+1, 0, prices, hm);
            maxProfit = Math.max(buy, noBuy);
        }else {
            int sell = maxProfit(i+2, 0, prices, hm) + prices[i];
            int noSell = maxProfit(i+1, 1, prices, hm);
            maxProfit = Math.max(sell, noSell);
        }
        hm.put(key, maxProfit);
        
        return maxProfit;
    }
}
