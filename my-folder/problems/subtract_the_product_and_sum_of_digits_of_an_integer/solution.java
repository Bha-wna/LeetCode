class Solution {
    public int subtractProductAndSum(int n) {
       List<Integer> arr = new ArrayList<>();
        while(n!=0)
        {
           arr.add(n%10)  ;
           n = n/10; 
            
        }
        int sum = 0, prod = 1, res=0;
        for(Integer arr1 :arr)
        {
            sum = sum + arr1;
            prod = prod*arr1;
        }
        res = prod - sum;
        return res;
        
    }
}
