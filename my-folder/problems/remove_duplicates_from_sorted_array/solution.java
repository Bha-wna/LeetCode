class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n =0;
     //   int count =0;
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                n++;
            }
            nums[n] = nums[i];
           // System.out.println(nums[i]);
           // System.out.println(Arrays.toString(nums));
        }
        return n+1;
    }
}