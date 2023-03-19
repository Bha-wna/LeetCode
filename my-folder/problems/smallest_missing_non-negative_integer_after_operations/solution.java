class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int left = 0;
        int right = nums.length;
        int res =0;
        while(left <=right){
            int mid = left+(right-left)/2;
            if(possible(mid,nums,value)){
                res = mid;
                left = mid+1;
            }
            else
                right = mid-1;
        }
        return res;
    }
    
    public static boolean possible(int mid,int[] nums, int value){
        int[] arr1 = new int[value];
        int[] arr2 = new int[value];
        
        for(int i=0; i<mid; i++){
            arr1[i % value]++;
        }
        
         for(int i=0; i<nums.length; i++){
            int val = ((nums[i]%value)+value)%value;
             arr2[val]++;
        }
        
        for(int i=0; i<value; i++){
            if(arr2[i]<arr1[i])
                return false;
        }
        return true;
    }
}