class Solution {
    public int maxProduct(int[] nums)
    { 
      int size = nums.length;  
      for(int i=0; i<nums.length ;i++) 
      {
         int min =i;
          for(int j=i; j<nums.length; j++)
          {
              if(nums[j] <nums[min])
              {
                  min =j;
              }
          }
         int temp = nums[min];
          nums[min] = nums[i];
          nums[i] = temp;
          
      }
      int res = (nums[size-1]-1)*(nums[size-2]-1);
      return res;  
    }
}