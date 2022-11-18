class Solution {
    public boolean isUgly(int n) {
       // if(n>0 && n<=5)
           // return true;
//         if(n<1)
//             return false;

//         int i=2;
//         while(i<=n)
//         {  
//            // System.out.println(i);
//             if(i==2 ||i==3|| i==5)
//             {   i++;
//                 continue;
//             }
//             else if(i%2 !=0 && i%3 !=0 && i%5 !=0){
//               //  System.out.println("i "+i) ;
//                 if(n%i==0)
//                   return false;
//             }
//             i++;  
//         }     
//         return true;
        for (int i=2; i<6 && n>0; i++)
        {   while (n % i == 0)
                n /= i;
        }
         return n == 1;
    }
}