class Solution {
    public int hardestWorker(int n, int[][] logs) {
         int m = logs.length;
        int[] time = new int[m]; 
        time[0] = logs[0][1];
        for(int i=1; i<m; i++)
        {
            time[i] = logs[i][1]-logs[i-1][1];
        }
        int maxi = Integer.MIN_VALUE;
        int t = 0;
        for(int i=0; i<m;i++)
        {
           if(time[i]>maxi)
           {   maxi = time[i];
               t=i;
           }
           else if(time[i]==maxi)
            {
                if(logs[i][0]<logs[t][0])
                {  // maxi = time[i];
                    t = i;
                }
            }
        }
        System.out.println(t);
        return logs[t][0];
      //  return 0;
    }
}