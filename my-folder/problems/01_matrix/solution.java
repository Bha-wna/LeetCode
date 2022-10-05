class Pair
{
    int first;
    int second;
    int third;
    public Pair(int first, int second, int third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int [][] vis = new int[n][m];
        int [][] dist = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(mat[i][j] == 0 )
                {   q.offer(new Pair(i,j,0));
                    vis[i][j] =1;
                }
                
            }
        }
      //  int steps =0;
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int st = q.peek().third;
            q.poll();
            dist[row][col] = st;
            for(int r =-1; r<=1; r++)
            {
                for(int c = -1; c<=1; c++)
                {
                  if(r != c && r != -c)
                  {
                    int nrow = r+row;
                    int ncol = c+ col;
                    if(nrow >=0 && nrow<n && ncol >=0 && ncol <m && vis[nrow][ncol]==0)
                    {
                        vis[nrow][ncol] =1;
                        q.offer(new Pair(nrow,ncol,st+1));
                    }
                  }
                }
            }
        }
        return dist;
    }
}