class Solution {
    public int bestClosingTime(String customers) {
        int count =0;
       // int ans =0;
        for(int i=0; i<customers.length(); i++)
        {
            if(customers.charAt(i)=='Y')
                count++;
        }
//         int[] p = new int[2];
//         p[0] = Integer.MAX_VALUE;
//         for(int i=0; i<=customers.length(); i++)
//         {
//             if(customers.charAt(i)=='Y')
//             { 
//               if(count-i < p[0])
//               { p[0] = count-i;
//                 p[1] = i; 
//               }    
//             }
            
//         }
        int n = customers.length();
        if(count==n)
            return n;
        if(count ==0)return 0;
        int ans = count, result =0;
        for(int i=0; i<n; i++)
        {
            if(customers.charAt(i)=='Y')
                count--;
            else 
                count++;
            if(ans >count)
            {
                ans = count;
                result = i+1;
            }
        }
        return result;
    }
}