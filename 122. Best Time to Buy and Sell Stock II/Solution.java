class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        int profit = 0;
//         int bd = 0;
//         int sd = 0;
        
//         for(int i=1;i<prices.length;i++) {
//             if(prices[i] > prices[i-1]) {
//                 sd++;
//             }else {
//                 profit += prices[sd] - prices[bd];
//                 bd = i;
//                 sd = i;
//             }
//         }
//         profit += prices[sd] - prices[bd];
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        
        return profit;
    }
}
