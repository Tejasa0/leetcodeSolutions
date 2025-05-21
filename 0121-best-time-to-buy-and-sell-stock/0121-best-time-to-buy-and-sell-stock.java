class Solution {
    public int maxProfit(int[] prices) {
        int smallIdx=0;
        int maxIdx=1;
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[smallIdx])
            {
                smallIdx=i;
            }
            else if(prices[i]>=prices[maxIdx])
            {
                maxIdx=i;
            }
            if(smallIdx<i && profit<prices[i]-prices[smallIdx])
            profit=prices[i]-prices[smallIdx];
        }
        return profit;
    }
}