class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        int n = intervals.length;
        if(n==1)
            return intervals;
        
        Arrays.sort(intervals, (a,b) ->(Integer.compare(a[0],b[0])));
        
        int[] prev = {intervals[0][0], intervals[0][1]};
        
        for(int i=1; i<intervals.length; i++)
        {
            if(prev[1] >= intervals[i][0])
            {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            }
            else
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(prev[0]);
                temp.add(prev[1]);
                arr.add(new ArrayList<>(temp));
                prev = intervals[i];
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
                temp.add(prev[0]);
                temp.add(prev[1]);
                arr.add(new ArrayList<>(temp));
        
        int len = arr.size();
        int[][] ans = new int[len][2];
        for(int i=0; i<len; i++)
        {
            ans[i][0] = arr.get(i).get(0);
            ans[i][1] = arr.get(i).get(1);
        }
        return ans;
    }
}