class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        
        for(int i=0; i< n; i++)
        {
            int ind =0;
            for(int j=0; j<nums2.length; j++)
            {
                if(nums2[j]==nums1[i])
                {
                    ind = j;
                    System.out.println(j);
                    break;
                }   
            }
            if(ind == nums2.length-1)
                ans[i] = -1;
            else{
            for(int k = ind+1; k< nums2.length; k++)
            {
                if(nums2[k]> nums1[i])
                {  ans[i] = nums2[k];
                   break;
                }
                else
                    ans[i] =-1;
            }          
          }
            System.out.println(ans[i]);
        }
        return ans;
    }
}