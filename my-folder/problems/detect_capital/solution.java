class Solution {
    public boolean detectCapitalUse(String word) {
        
        //check if everything is uppercase or just the first letter.
        int n= word.length();
        if(n==1)
            return true;
        if(Character.isUpperCase(word.charAt(0)))
        {
              //if all are uppercase  
           if(Character.isUpperCase(word.charAt(1)))
           {
               for(int i =2; i<n;i++)
               {
                   char ch = word.charAt(i);
                   {
                       if(!Character.isUpperCase(ch))
                           return false;
                   }
               }
           }
           else if(Character.isLowerCase(word.charAt(1)))
           {
               for(int i =2; i<n;i++)
               {
                   char ch = word.charAt(i);
                   {
                       if(Character.isUpperCase(ch))
                           return false;
                   }
               }
           }
        }
        else if(Character.isLowerCase(word.charAt(0)))
        {
            for(int i=1; i<n; i++)
            {
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch))
                    return false;
            }
        }
                
        return true;
    }
}