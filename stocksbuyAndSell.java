class Solution {
    public int maxProfit(int[] prices) {
     
     int maxProfit=-1;

     int min=prices[0];
     int max=prices[0];
     int i=0;
     while(i<prices.length)
     {
      max=prices[i];
      int profit=max-min;
      maxProfit=Math.max(profit,maxProfit);
      
      if(prices[i]<min) min=prices[i];

      i++;
     }
     return maxProfit;

    }
}