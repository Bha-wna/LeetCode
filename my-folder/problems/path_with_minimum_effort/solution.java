class Tuple{
    int distance;
    int row;
    int col;
    public Tuple(int distance, int row, int col)
    {
        this.distance = distance;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
   
        //min heap as per distance
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);
        pq.offer(new Tuple(0,0,0));
        int n = heights.length;
        int m = heights[0].length;
        
        int[][] dist = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dist[i][j] = (int)1e9;
            }
        }
        dist[0][0]=0;
        
        while(!pq.isEmpty())
        {
            int dis = pq.peek().distance;
            int r = pq.peek().row;
            int c = pq.peek().col;
           //System.out.println(dis + " /" + r+ " /" +c );
            pq.poll();
            
            if(r == n-1 && c == m-1)
            {
             // System.out.println(Arrays.deepToString(dist));
                return dis;
            }
            for(int i=-1; i<=1; i++)
            {
                for(int j=-1; j<=1; j++)
                {
                    if(i!=j && i!= -j)
                    {
                        int nrow = r+i;
                        int ncol = c+j;
                        if(nrow >=0 && nrow<n && ncol >=0 && ncol<m )
                        {
                            int newEffort = Math.max(Math.abs(heights[r][c]-heights[nrow][ncol]),dis);
                            if(newEffort< dist[nrow][ncol])
                               {   dist[nrow][ncol] = newEffort;
                                   pq.offer(new Tuple(newEffort,nrow,ncol));
                               }
                        }
                    }
                }
            }
        }
        return 0;
    }
}