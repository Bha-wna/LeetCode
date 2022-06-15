class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        
        for(int i=0; i<prefix.length; i++)
        {
            if(i==0) prefix[i]= nums[i];
            else
                prefix[i] =  nums[i]*prefix[i-1];
        }
        
        for(int j= suffix.length-1; j>=0; j--)
        {
            if(j==suffix.length-1)
                suffix[j]= nums[j];
            else
                suffix[j] = nums[j]*suffix[j+1];
        }
        
        for(int i=0; i<answer.length; i++)
        {  
            if(i==0) 
                answer[i] = suffix[i+1];
           else if(i==answer.length-1) 
               answer[i]=prefix[i-1];
            else 
                answer[i] = suffix[i+1]*prefix[i-1];
        }
       return answer; 
    }
}