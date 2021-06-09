class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
       return( getValueOf(firstWord) + getValueOf(secondWord) == getValueOf(targetWord));
     
    }
    
    public int getValueOf(String s)
    {
       int sum =0;
        
        for(int i=0; i<s.length(); i++)
        {
           sum = sum*10 + s.charAt(i)-'a'; 
        }
        return sum;
        
    }
    
}