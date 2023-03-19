class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int even=0, odd=0;
        String s = Integer.toBinaryString(n);
        int len = s.length()-1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1')
            {
                if((len-i)%2==0)
                    even++;
                else
                    odd++;
            }
        }
        ans[0]=even;
        ans[1] = odd;
        return ans;
    }
}