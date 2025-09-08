class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin; i <= amount; i++){
                if(dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}
