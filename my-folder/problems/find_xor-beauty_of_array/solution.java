class Solution {
    public int xorBeauty(int[] nums) {
        int val =0;
        for(int i=0; i<nums.length; i++)
        {
            val = val^nums[i];
        }
      return val;  
    }
}