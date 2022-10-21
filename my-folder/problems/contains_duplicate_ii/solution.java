class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       // int i=0;
       // int j = nums.length-1;
       //  while(i<j)
       //  {
       //      if(nums[i]==nums[j] && Math.abs(i-j)<= k)
       //          return true;
       //      i++; j--;
       //  }
       //  return false;
        //Hashmap store no and its indice
        Map<Integer,Integer>m = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!m.containsKey(nums[i]))
                m.put(nums[i],i);
            else
            {
                int j = m.get(nums[i]);
                if(Math.abs(i-j)<=k)
                    return true;
                else
                    m.put(nums[i],i);
            }
        }
        return false;
    }
}