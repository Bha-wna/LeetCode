class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
          int n = nums.length;
        if (k > n)
            return 0;
        long maxi = 0, sum = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < n; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            sum += nums[i];
            
            if (i >= k){
                m.put(nums[i - k], m.getOrDefault(nums[i - k],0)-1) ;
                sum -= nums[i - k];

                if (m.get(nums[i - k]) == 0)
                    m.remove(nums[i - k]);
            }
            if(m.size() == k)
                maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}