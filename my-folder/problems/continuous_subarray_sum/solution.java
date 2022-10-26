class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>m = new HashMap<>();
        int sum =0;
        int x =0;
        if(nums.length<2)
            return false;
        for(int it:nums)
        {
            sum += it;
            sum %=k;
            if(m.containsKey(sum))
                return true;
            m.put(x,1);
            x=sum;
        }
       return false; 
    }
}