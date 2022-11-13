class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int ans =0;
        for(int i=0; i<nums.length; i++)
        {
            int l = nums[i];
            for(int j =i; j<nums.length; j++)
            {
                l = lcm(l,nums[j]);
                if(l==k)
                    ans++;
            }
        }
        return ans;
    }
   
    static long gcd(long a, long b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static int lcm(int a, int b)
    {
        return (int)(a/gcd(a,b))*b;
    }
}