class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set<Integer> s = new HashSet<>();
        boolean b = false;
        for(int i =0; i <nums.length; i++)
        { 
            s.add(nums[i]);
        }
         if(s.size()==nums.length)
            b = false;
        else
            b = true;
        
        return b;
    }
}  
        
        
      