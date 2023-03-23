class Solution {
    public int rob(int[] nums) {
        // int[] dp = new int[nums.length];
        // dp[0] = nums[0];
        int prev =nums[0];
        int prev2 =0;
        for(int i=1; i<nums.length; i++){
        
         int pick =nums[i];
         if(i>1)
             pick  += prev2;
         int notPick = 0 + prev;
         int curr = Math.max(pick, notPick);
            
          prev2 = prev;
          prev = curr;  
            
        }
        return prev;
        //return helper(nums.length-1, nums, dp);
    }
    //public static int helper(int idx, int[]nums, int[] dp){
        
//         if(idx==0)
//             return nums[idx];
//         if(idx<0)
//             return 0;
//         if(dp[idx]!=0)
//             return dp[idx];
        

//     }
}