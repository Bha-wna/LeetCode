class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count1 =0;
        int count2=0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
               if(nums[i]==nums[j])
               {
                   nums[i]=-1;
                   nums[j] = -1;
               }
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<0)
                count1++;
            else
                count2++;
        }
        int [] ans = new int[2];
        ans[0] = count1/2;
        ans[1] = count2;
        return ans;
    }
}