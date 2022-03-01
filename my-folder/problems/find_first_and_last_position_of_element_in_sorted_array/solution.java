class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        
        arr[0] = FirstPosition(nums,target);
        arr[1] = LastPosition(nums, target);
        return arr;
    } 
        public static int FirstPosition(int[] nums, int target)
        { 
          int start = 0;
          int end = nums.length-1;
          int res1= -1;  
          while(start<=end)
           {   
            int mid = start + ((end-start)/2);
            if(nums[mid] == target)
            {   res1 = mid;
                end = mid-1;
            }
            else if (nums[mid] > target)
                end = mid-1;
            else
                start = mid +1;
           } 
           return res1;  
        }
        
        public static int LastPosition(int[] nums, int target)
        {  
           int start = 0;
           int end = nums.length-1;
           int res2= -1;
           while(start<=end)
            {
            int mid = start + ((end-start)/2);
            if(nums[mid] == target)
            {   res2 = mid;
                start = mid+1;
            }
            else if (nums[mid] > target)
                end = mid-1;
            else
                start = mid +1;
           }
          return res2;
        }
}