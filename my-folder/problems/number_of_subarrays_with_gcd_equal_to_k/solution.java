class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans =0;
        for(int i=0; i<nums.length; i++)
        {
            int gcd =0;
            for(int j=i; j<nums.length; j++)
            {
                gcd = gcd(gcd,nums[j]);
                if(gcd ==k)
                    ans++;
            }
        }
        return ans;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
}