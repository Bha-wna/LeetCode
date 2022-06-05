class Solution {
    public int minMaxGame(int[] nums) {
      int n = nums.length;
       // int ans =0;
        while(n!=1)
        {
            int newnums[] = new int[n/2];
            
            for(int i=0; i< newnums.length; i++)
            {
                if(i%2==0)
                    newnums[i] = Math.min(nums[2*i],nums[2*i +1]);
                else
                    newnums[i] = Math.max(nums[2*i],nums[2*i +1]);
            }
            n= newnums.length;
            for(int j=0; j< newnums.length; j++)
            {
                nums[j] = newnums[j];
            }
          //  ans= newnums[0];
        }
        return nums[0];
    }
}