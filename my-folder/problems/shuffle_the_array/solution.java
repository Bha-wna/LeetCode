class Solution {
    public int[] shuffle(int[] nums, int n) 
    { 
      
      int i= 0;
      int j= 0;
      int newNums[] = new int[nums.length];
      while(j < nums.length)
      {
        newNums[j] = nums[i];
        i++;  
        j++;
        newNums[j] = nums[n];
        n++;
        j++;  
      }
    
        return newNums;  
    }
      
       
    }
