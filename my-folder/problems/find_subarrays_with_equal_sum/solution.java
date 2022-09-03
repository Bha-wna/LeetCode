class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length-1; i++)
        {
            if(!hm.containsValue(nums[i] + nums[i+1]))
                 hm.put(nums[i],(nums[i]+nums[i+1]));
            else
                return true;
        }
        return false;
    }
}