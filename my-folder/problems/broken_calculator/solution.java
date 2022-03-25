class Solution {
    int ans=0;
    public int brokenCalc(int startValue, int target) {
        if(startValue > target)
            return startValue - target;
        
        if(startValue==target)
            return ans;
        if(target%2==0)
          ans=  brokenCalc(startValue, target/2);
        else
            ans =brokenCalc(startValue, target+1);
        return 1+ans;
    }
}