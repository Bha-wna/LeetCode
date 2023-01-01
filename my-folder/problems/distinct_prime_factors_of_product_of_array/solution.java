class Solution {
    Set<Integer> s = new HashSet<>();
    public int distinctPrimeFactors(int[] nums) {
        for(int i : nums)
        {
            if(isPrime(i))
                s.add(i);
            else
                findfactors(i);
        }
        System.out.println(s);
        return s.size();
    }
        
       public void findfactors(int n)
        {
            int it =2;
            while(it<= n/2)
            {
                if(n%it==0 && isPrime(it))
                    s.add(it);
                it++;
            }
        }
        boolean isPrime(long n)
    {  
        if(n<=1)return false;
        if(n==2 || n==3)
            return true;
        long i=2;
        while(i<= n/2)
        {
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }

}