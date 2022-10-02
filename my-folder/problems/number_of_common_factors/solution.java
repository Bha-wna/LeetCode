class Solution {
    public int commonFactors(int a, int b) {
       int count =0;
        int factor =1;
        while(factor <= a && factor <=b)
        {
            if(a%factor ==0 && b% factor ==0)
            { count ++;
               System.out.println(factor);
            }
            factor ++;
        }
        return count;
    }
}