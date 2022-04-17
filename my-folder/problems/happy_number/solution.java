class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
           slow = findsquare(slow);
           fast = findsquare(findsquare(fast));
            
        }while(fast !=slow);
        if(slow==1)
            return true;
        else
            return false;
    }
    public int findsquare(int number)
    {
        int ans =0;
        while(number !=0)
        {
            int rem = number%10;
            ans += rem*rem;
            number = number/10;
        }
        return ans;
    }
}