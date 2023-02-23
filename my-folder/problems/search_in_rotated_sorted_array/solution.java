//will solve using recursion
class Solution {
    public int search(int[] nums, int target) {
        
        return helper(nums,target, 0,nums.length-1);
        
    }
    public int helper(int[] nums, int target, int s, int e){
        if(s >e)
            return -1;
        
        int mid = s+(e-s)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[s]<= nums[mid]){
            if(target >= nums[s] && target <=nums[mid])
            {
               return helper(nums, target, s,mid-1); 
            }
            else
            {
                return helper(nums,target,mid+1,e);
            }
        }
        if(target >= nums[mid] && target <= nums[e])
           return helper(nums,target,mid+1,e);
        else
            return helper(nums,target,s,mid-1);
    }
}