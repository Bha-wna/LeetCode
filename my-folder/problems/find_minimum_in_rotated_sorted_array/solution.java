class Solution {
    public int findMin(int[] nums) {
        
        int i=0;
        int j = nums.length-1;
        if(nums[0] < nums[j])
            return nums[0];
        while(i < j)
        {
            int mid = i+(j-i)/2;
                if( nums[mid] >= nums[0])
                    i = mid+1;
                else if (nums[mid] < nums[0])
                    j= mid;
        }
        return nums[i];
    }
}