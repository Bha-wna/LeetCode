class Solution {
    public int findMaxK(int[] nums) {
       Arrays.sort(nums);
      //  int j=nums.length-1;
        for(int i=0; i<nums.length; i++)
        {
            for(int j:nums)
            {
                if(nums[i]==-j)
                    return j;
            }
         
        }
        return -1;
    }
}