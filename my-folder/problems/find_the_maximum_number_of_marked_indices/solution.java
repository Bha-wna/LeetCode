class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int l= 0, n = nums.length, count=0;
        int r = n/2;
        Arrays.sort(nums);
        while(l<n/2 && r < n){
            if(nums[l]*2 <= nums[r]){
                l++;
                r++;
                count+=2;
            }
            else
                r++;
        }
        return count;
    }
}