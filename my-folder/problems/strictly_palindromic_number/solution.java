class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String str = Integer.toString(n);
        int i= 2;
        while( i<= n-2)
        {
            String answer = convertFromBaseToBase(str, 10, i);
            if(isPalindrome(answer))
                i++;
            else
                return false;
        }
        return true;
    }
    public static String convertFromBaseToBase(String str, int fromBase, int toBase)
    {
        return Integer.toString(Integer.parseInt(str, fromBase), toBase);
    }
    
    public static boolean isPalindrome(String answer)
    {
        int i=0;
        int j= answer.length()-1;
        while(i<j)
        {
            if(answer.charAt(i)== answer.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}