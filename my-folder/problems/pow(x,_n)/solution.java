class Solution {
    public double myPow(double x, int n) {
      double ans =1;
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n>1)
        {  
        if(n%2==0)
        {  ans = myPow(x,n/2);
           return ans*ans;
        }
        else
        {  ans = myPow(x,n/2);
            return x*ans*ans;
        }
        }
        if(n<= -1)
          {
         //   if(n==-1)
            //   return x;
        if(n%2==0)
        {  ans = myPow(x,n/2);
           return (ans*ans);
        }
        else
        { ans = myPow(x,n/2);
            return ((1/x)*ans*ans);
        }
        }    
       return 1; 
    }
}