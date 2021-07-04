class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
       // int [] arr = new int[n];
           Arrays.sort(nums);
        int diff = (nums[n-1]*nums[n-2]) - (nums[0]*nums[1]);
        return diff;
    }
}