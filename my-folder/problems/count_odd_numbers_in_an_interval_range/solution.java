class Solution {
    public int countOdds(int low, int high) {
        int n;
        if(low%2 !=0 && high%2 !=0)
        {
          n= high-low-1;
            n= n/2 +2;
        }
    /*    else
        {if(low==high)
           {
            if(low%2 !=0)
                n=1;
            else
                n=0;
           }
           */
           else
           {
               n=high-low-1;
               n= n/2+1;
           }   
        if(low==high)
        {
            if(low%2==0)
               return 0; 
            else
                return 1;   
        }
        else
        return n;
    }
}