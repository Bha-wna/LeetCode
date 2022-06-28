class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int WindowSum =0, minLength = Integer.MAX_VALUE;
        int WindowStart =0;
        
        for(int end =0; end< nums.length; end++)
        {
            WindowSum += nums[end];
            
            if(WindowSum >= target)
            {
                while(WindowSum >= target)
                {
                    minLength = Math.min(minLength, end-WindowStart+1 );
                    WindowSum -= nums[WindowStart];
                    WindowStart++;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0: minLength;
    }
}