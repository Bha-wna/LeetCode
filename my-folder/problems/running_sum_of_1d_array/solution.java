class Solution {
    int k=0;
    int j=0;
   // int i=0;
   // int d = nums.length;
      
    public int[] runningSum(int[] nums) 
    {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        { 
           
            if( i==0)
           {
             nums[i]= nums[i];
           }
           else
           {
            for(j=0; j<1; j++)
            { 
             nums[i]= nums[i]+ arr[k-1]  ;
            }
           }    
           arr[k]= nums[i];
            k++;
         
          // k[i]= nums[i];
           // arr = k; 
        }
        return arr;
    }
}