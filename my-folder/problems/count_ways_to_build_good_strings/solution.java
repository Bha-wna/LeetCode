class Solution {
       static int mod = (int)1e9 +7;
       static int dp[] = new int[100001];
    public int countGoodStrings(int low, int high, int zero, int one) {

         int count =0;
        for(int i=0; i<dp.length; i++)
        {
            dp[i] = -1;
        }
        for(int i=low; i<=high; i++)
        {
            count = (count + solve(i,zero,one))%mod;
        }
        return count;
    }
    public static int  solve(int n, int zero, int one)
    {
        if(n==0)
            return 1;
        
        if(dp[n] !=-1)
            return dp[n];
        
        int ans =0;
        if(n>=zero)
            ans = (ans + solve(n-zero, zero, one))%mod;
        
        if(n>=one)
            ans = ( ans + solve(n-one, zero, one))%mod;
        
        dp[n]= ans;
        
        return dp[n]%mod;
    }
}