class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
 
           int count = 0;
           int maxConsecutiveOne =0;
           
           for(int i=0 ; i< nums.length;i++)
           {
               if(nums[i]==1)
               {
                   count++;
                   maxConsecutiveOne = Math.max(count, maxConsecutiveOne);
               }
               else 
               {
               count = 0;
               } 
           }
           return maxConsecutiveOne;
         }
      public static void main(String[]args)
         {   int nums[]= {1,0,0,1,1,1};
          System.out.println(findMaxConsecutiveOnes(nums));
         }
       }
        
    
