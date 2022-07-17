class Solution {
    public int maximumSum(int[] nums) {
       int ansSum =-1; int currSum =-1; 
       
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!m.containsKey(sumOfDigits(nums[i])))
                m.put(sumOfDigits(nums[i]),nums[i]);
            else
            {  
                currSum = m.get(sumOfDigits(nums[i])) + nums[i];
                if(currSum > ansSum)
                    ansSum = currSum;
                
                if(m.get(sumOfDigits(nums[i]))< nums[i])
                {  
                    m.put(sumOfDigits(nums[i]),nums[i]);  
                }
            }
        }
        return ansSum;
    }
    public int sumOfDigits(int num)
    {   int rem=0;
        while(num >0)
        {
           rem = rem + num%10;
           num = num/10;
        }
     return rem;
    }
}