class Solution {
    public int averageValue(int[] nums) {
        int avg =0;
        int sum =0;
        int count =0;
        for(int it : nums)
        {
            if(it%2==0 && it%3==0)
            {
                sum += it;
                count++;
            }
        }
        if(count !=0)
         avg = sum/count;
        
        return avg;
    }
}