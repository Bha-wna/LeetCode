class Solution {
    public int climbStairs(int n) {
        
        if(n<=2)
            return n;
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
        // Arrays.fill(dp,-1);
        // return helper(n,dp);
    }
    
//     public int helper(int n, int[]dp){
//         if(n<=2)
//             return n;
//         if(dp[n]!=-1)
//             return dp[n];
        
//        return dp[n]= helper(n-1,dp)+ helper(n-2,dp);
//     }
}