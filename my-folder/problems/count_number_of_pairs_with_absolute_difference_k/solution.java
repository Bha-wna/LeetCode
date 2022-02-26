class Solution {
    public int countKDifference(int[] nums, int k) {
        int arr[] = new int[101];
        for(int i=0; i<nums.length; i++)
        {
            arr[nums[i]]++;
        }
        int sum =0;
        for(int i=0;i <=arr.length-1-k; i++)
        {
            sum += arr[i]*arr[i+k];
        }
        return sum;
    }
}