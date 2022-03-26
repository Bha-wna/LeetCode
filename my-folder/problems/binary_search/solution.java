class Solution {
    public int search(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;
       
        
        int ans =Bsearch(nums,start, end,target);
        return ans;
    }
    public int Bsearch(int[] nums,int start, int end, int target)
    { 
       int mid = start+ (end-start)/2;
       if(start >end)
           return -1;
        if(nums[mid]== target)
           return mid;
        else if(target >nums[mid])
           return  Bsearch(nums,mid+1, end,target);
        else
          return  Bsearch(nums,start, mid-1, target);
    }
}