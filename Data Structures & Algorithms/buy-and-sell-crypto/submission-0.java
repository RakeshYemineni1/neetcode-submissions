class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];

        int n = prices.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(prices[i] < low){
                low = prices[i];
            }else{
                ans = Math.max(ans, prices[i] - low);
            }
        }
        return ans;
    }
}
