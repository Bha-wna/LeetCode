class Solution {
    public boolean sumOfNumberAndReverse(int num) {
      
        for(int i=0; i<=num; i++)
        {
            if((i + rev(i))== num)
                return true;
        }
        return false;
    }
   public int rev(int num)
    {
        int rev = 0; // reversed number
      int rem;   // remainder
       
      while(num>0){
          
        rem = num%10;
        rev = (rev*10) + rem;
        num = num/10;
      }
       
      return rev;
    } 
}