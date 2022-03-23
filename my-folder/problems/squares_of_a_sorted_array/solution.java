class Solution {
    public int[] sortedSquares(int[] nums) {
       int res[] = new int[nums.length];
        int l=0;
       int r = nums.length-1;
       int idx=r;
        while(l<=r)
        {
            if(Math.abs(nums[l])<=Math.abs(nums[r]))
            { res[idx] = nums[r]*nums[r];
              r--;
              idx--;
            }
            else
            {  res[idx] = nums[l]*nums[l];
                l++;
                idx--;
            }
        }
        return res;
    }
}