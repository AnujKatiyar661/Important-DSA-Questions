class Solution {
  
    public int maxProfit(int[] prices) {
        int buy_point=prices[0];
      
        int profit=0;
        for(int i=1;i<prices.length;i++){
          
            buy_point=Math.min(buy_point,prices[i]);
          
            int psit=prices[i]-buy_point;
          
            //psit-> profit if sold today
            profit=Math.max(profit,psit);
          
        }
        return profit;  
    }
}
