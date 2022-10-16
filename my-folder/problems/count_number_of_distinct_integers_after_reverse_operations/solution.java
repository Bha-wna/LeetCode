import java.util.*;
class Solution {
    public int countDistinctIntegers(int[] nums) {
       Set<Integer> arr = new HashSet<>();
      //  int count =0;
        for(int i : nums)
        {
            arr.add(i);
        }
       for(int j=0; j<nums.length; j++)
       {
           int temp = rev(nums[j]);
           System.out.println("temp" + temp);
           arr.add(temp);  
       }
       return arr.size();  
    }
    public int rev(int num)
    {
        int rev = 0; // reversed number
      int rem;   // remainder
       
      while(num>0){
          
        rem = num%10;
        rev = (rev*10) + rem;
        num = num/10;
      }
       
      return rev;
    }
}