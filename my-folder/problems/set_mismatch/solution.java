class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            if(!m.containsKey(nums[i]))
                m.put(nums[i],1);
           else
               m.put(nums[i],m.get(nums[i])+1);
        }
        for(int i=1; i<=nums.length;i++)
        {
            if(!m.containsKey(i))
                ans[1] =i;
            else if(m.get(i)>1)
                ans[0]=i;
        }
        return ans;
    }
}