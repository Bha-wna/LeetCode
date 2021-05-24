class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //int index=0;
        int small =0;
        int [] newNums = new int[nums.length];
        for(int i=0; i<nums.length; i++)
          {  
            for(int index =0; index< nums.length; index++)
            {
              if(nums[i] > nums[index])
               {
                 small++;  
               }
             
             newNums[i] = small;   
            }
            small =0;
            
        }
        return newNums;
        
    }
}