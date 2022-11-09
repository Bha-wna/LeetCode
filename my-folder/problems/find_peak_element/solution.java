class Solution {
    public int findPeakElement(int[] nums) {
        
       int len = nums.length;
        if(len<2)
            return 0;
       int l=0;
       int r = len-1;
        while(l<=r)
        {
          int mid = l + (r-l)/2;
          if(mid >0 && mid <len-1)
          {
              if(nums[mid] >=nums[mid-1] && nums[mid] >=nums[mid+1])
                  return mid;
              else if(nums[mid] < nums[mid+1])
                   l= mid+1;
                 
              else
                  r = mid-1;
          }
            else
            {  
                if(mid==0)
                {
                if(nums[0] > nums[1])
                    return 0;
                else
                    return 1;
                }
                else if(mid== len-1)
                {
                    if(nums[len-1] > nums[len-2])
                        return len-1;
                    else
                        return len-2;
                }
            }
        }
        return -1;
    }
}