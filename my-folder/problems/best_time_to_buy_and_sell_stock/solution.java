class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0];
        int max =0;
        
        for(int i=0; i<prices.length; i++)
        {
            int sell= prices[i];
            
            if(buy > prices[i])
                buy = prices[i];
            
            if(sell - buy > max) max= sell-buy;
        }
        return (max >0) ? max : 0;
    }
}