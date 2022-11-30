class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                    dist[i][j] =0;
                else
                 dist[i][j] = (int)1e9;
            }
        }
        
        for(int i=0; i<edges.length; i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            
            dist[u][v] = wt;
            dist[v][u] = wt;
        }
       // System.out.println(Arrays.deepToString(dist));//[]
        
        for(int k=0; k<n; k++)
        {
          for(int i=0; i<n; i++)
          {
              for(int j=0; j<n ; j++)
              {
                  dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
              }
          }
        }
      //  System.out.println(Arrays.deepToString(dist));
        
        int ctMax =Integer.MAX_VALUE;
        int city =0;
        //int ct =0;
        for(int i=0; i<n; i++)
        {
            int ct =0;
            for(int j=0; j<n; j++)
            {
               if(i != j &&  dist[i][j]<=distanceThreshold )
                   ct++;
            }
            //ctMax = Math.min(ctMax, ct);
         //   System.out.println(i + " i: " + ct + "....." + ctMax);
            if(ct<= ctMax)
            {  ctMax = ct;
               city = i;
            }
        }
        return city;
    }
}