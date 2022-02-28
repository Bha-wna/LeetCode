class Solution {
    public int subtractProductAndSum(int n) {
        int prod =1;
        int sum=0;
        int ret =0;
        int r=0;
        while(n !=0)
        {
           r = n%10;
           // prod =n%10; 
            n= n/10;
            sum = sum+r;
            prod = prod*r;     
        }
        ret = prod- sum;
        return ret;
    }
}