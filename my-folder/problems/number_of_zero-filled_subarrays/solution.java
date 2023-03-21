class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long answer =0;
        int count =0;
        int n = nums.length;
        for(int i=0;i<n; i++){
            if(nums[i]==0)
            {   
                int val = count +1;
                count++;
                answer+=val;
            }
            else
                count =0;
            
        }
        return answer;
    }
}