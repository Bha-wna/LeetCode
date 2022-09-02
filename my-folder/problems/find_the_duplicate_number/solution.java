class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length)
        {
            if(nums[i] != i+1)
            {  
               if(nums[i] != nums[nums[i]-1])
               {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
               } 
                else
                    return nums[i];
            }
            else
                i++;
        }

        return -1;
    }
}