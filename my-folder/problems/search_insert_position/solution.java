class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length, ind =0;
        
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target)
                return mid;
            
            else if(nums[mid]> target)
                end = mid-1;
            else
                start = mid+1;
        }
        System.out.println("start :" + start + "end :"+ end);
        if(start != nums.length && nums[start]< target && nums[start+1]> target)
          return start+1;
        return start;
    }
}