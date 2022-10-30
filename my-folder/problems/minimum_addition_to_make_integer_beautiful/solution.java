class Solution {
    public long makeIntegerBeautiful(long n, int target) {
     long ans =0;
     if(sumOfDigits(n)>target)
     {
          long i=n; 
       
            for(long size = 10; size<Long.MAX_VALUE; size = size*10)
            {
               i= ((i/size)*size)+size;
                 System.out.println(i);
               if(sumOfDigits(i)<=target)
               {
                  
                ans = i-n;
                System.out.println(ans);
                return ans;
               }
            }  
        
      }
      return 0;
    }
  private static long sumOfDigits(long i)
    {
        long sum =0;
        while(i>0)
        {   
          sum += i%10;
          i = i/10;
        }
        return sum;
    }
}
//         String s = String.valueOf(n);
//         System.out.println(s);
//         int len = s.length();
//         String s1 = "";
         
//         for(int i=0; i<len; i++)
//         {
//            if(i==0)
//            {  
//                char ch = s.charAt(i);
//                int a = ch -'0';
//                a++;
//                s1 += Integer.toString(a);
//                     System.out.println(s1);
//            }
//             else s1 += "0";     
//         }
//         long limit = Long.parseLong(s1);
//         System.out.println(limit);
       
 