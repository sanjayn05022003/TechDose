class Solution {
    public int maxProfit(int[] prices) {
        
        int len=prices.length;
        
        int min=prices[0];
        int diff=0;
        
        for(int i=1;i<len;i++){
            if(prices[i]>min){
                if((prices[i]-min)>diff){
                    diff=prices[i]-min;
                }
            }
            else{
                min=prices[i];
            }
        }
        
        return diff;
    }
}
