class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            if(!m.containsKey(target-nums[i]))
                m.put(nums[i],i);
            
             else
             {
                 ans[0] = i;
                 ans[1] = m.get(target-nums[i]);
             } 
        }
        return ans;
    }
}