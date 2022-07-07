import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>m = new HashMap<>();
        for(int i=0; i<nums.length;i++)
            {
           if(m.containsKey(nums[i]))
               m.put(nums[i],m.get(nums[i])+1);
            else 
                m.put(nums[i],1);
        }
        int ans = Collections.max(m.values());
       for(Map.Entry<Integer,Integer> m1: m.entrySet())
     {
      


             if(m1.getValue()== ans)
                return m1.getKey();
        }
        return -1;
            
    }
}