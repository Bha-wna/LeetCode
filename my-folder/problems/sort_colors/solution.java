class Solution {
    public void sortColors(int[] nums) {
        int c0= 0;
        int c1=0;
        int c2=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                c0++;
            if(nums[i]==1)
                c1++;
            if(nums[i]==2)
                c2++;
        }
        // for(int j=0; j<c0; j++)
        // {
        //     nums[j]=0;
        // }
        // for(int k= c0; k<c0+c1; k++)
        // {
        //     nums[k] =1;
        // }
        // for(int l= c0+c1; l<nums.length; l++)
        // {
        //     nums[l]=2;
        // }
        for(int i=0;i<nums.length; i++)
        {
            if(i<c0)
                nums[i]=0;
            else if(i<c0+c1)
                nums[i] =1;
            else
                nums[i]=2;
        }
    }
}