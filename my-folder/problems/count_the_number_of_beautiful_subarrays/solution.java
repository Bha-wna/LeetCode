class Solution {
    public long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        long ans =0;
        int temp =0;
        int count=0;
        
        for(int i=0; i<nums.length; i++){
            temp ^= nums[i];
            if(temp==0)
            {
                count++;
                continue;
            }
            if(m.containsKey(temp))
                ans += m.get(temp);
            
            m.put(temp, m.getOrDefault(temp,0)+1);
        }
        ans += (count*1L*(count+1))/2;
        return ans;
    }
}