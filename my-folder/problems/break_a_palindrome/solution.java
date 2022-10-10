class Solution {
    public String breakPalindrome(String palindrome) {
        String ans ="";
        int n = palindrome.length();
        if(palindrome.length()==1)
            return ans;
        if(palindrome.length()==3)
        {
            if(palindrome.charAt(0)=='a' && palindrome.charAt(n-1)=='a')
            {   
                ans = palindrome.substring(0, n-1) + 'b' ;
                return ans;
            }
        }
        
        if(palindrome.charAt(0)=='a')
        {   
            if(palindrome.charAt(n-1)=='a' && palindrome.charAt(1) == 'a')
                ans = palindrome.substring(0, n-1) + 'b' ;
           else if(palindrome.charAt(1) == 'a')
                ans = palindrome.substring(0, 1) + 'b' + palindrome.substring(2);
            else
            {  
                char ch = (char)((int)palindrome.charAt(1)-1);
                 ans = palindrome.substring(0, 1) + 'a' + palindrome.substring(2);
            }
        }
        else
        {
           // char ch = (char)((int)palindrome.charAt(0)-1);
            ans = 'a' + palindrome.substring(1);
        }
        if(isPalindrome(ans))
        {   
            System.out.println((char)((int)ans.charAt(0)+1));
            if(palindrome.charAt(1) == (char)((int)palindrome.charAt(0)+1))
            {  
                char ch = (char)((int)palindrome.charAt(2)+1);
               // System.out.println(ch);
                ans = palindrome.substring(0, 2) + ch + palindrome.substring(3);
            }
        }
        
        return ans;
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j= s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i) !=s.charAt(j))
            {
              return false;
            }
            i++;
            j--;
        }
        System.out.println("i");
        return true;
    }
}