class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a,b)->Long.compare(b,a));
        
        long score = 0;
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            pq.offer((long)nums[i]);
        }
        
        while(k>0)
        {   long val = pq.poll();
            score += val;
            k--;
            long p = (long)Math.ceil(val*1.0/3*1.0);
            pq.offer(p);    
        }
        return score;
    }
}