class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<n+1; i++)
        {
            arr[i] =-1;
        }
        return helper(n,arr);
    }
    
    public int helper(int n, int[] arr)
    {
        int mini = Integer.MAX_VALUE;
        if(n==0)
            return arr[0] =0;
        if(arr[n] !=-1)
            return arr[n];
        for(int i=1; i<=Math.sqrt(n); i++)
        {
           int val = 1 + helper(n-(i*i), arr); 
            mini = Math.min(val,mini);
        }
        
        return arr[n]=mini;
    }
}