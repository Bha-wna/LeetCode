class Solution {
     public static void main(String[]args)
    {
        int x= 121;
        boolean b= isPalindrome(x);
        if(b)
            System.out.println("Palindrome");
        else
            System.out.println("not a palindrome");
    }
    
    public static  boolean isPalindrome(int x)
    {
        int r, s=0;
        int temp=x;
        while(x>0)
        {
           r=x%10;
           x= x/10;
           s= s*10+r;
        }  if(s==temp)
            {
                return true;
            }
            
            else
            {   
                return false;
            }
    }
   
}