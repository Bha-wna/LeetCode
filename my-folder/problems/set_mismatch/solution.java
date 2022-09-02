class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] arr = new int [2];
        int i=0;
        while(i < nums.length)
        {
            if(nums[i] != nums[nums[i]-1])
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] =  nums[i];
                nums[i] = temp;
            }
            else
                i++;
        }
        for(int j=0;  j<nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                arr[0] = nums[j];
                arr[1] =  j+1;
            }
        }
        return arr;
    }
}