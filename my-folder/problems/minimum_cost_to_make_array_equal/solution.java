class Solution {
    public long minCost(int[] nums, int[] cost) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]<mini)
                mini = nums[i];
            if(nums[i]>maxi)
                maxi = nums[i];
        }
        int start = mini ;
        int end = maxi;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            long temp1=0,temp2=0,temp3 =0;
            temp1 = solve(mid,nums,cost);
            temp2 = solve(mid-1,nums,cost);
            temp3 = solve(mid+1, nums,cost);
            if(temp1<= temp2 && temp1<=temp3)
                return temp1;
            else if(temp1 <= temp2 && temp3<= temp1)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static long solve(int mid, int[]nums, int[]cost)
    {
        long ans =0;
        for(int i=0; i<nums.length; i++)
        {
            int diff = Math.abs(nums[i]-mid);
            ans += 1L*diff*cost[i];
        }
        return ans;
    }
    
}