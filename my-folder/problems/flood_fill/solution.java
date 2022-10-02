class Pair
{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> q = new LinkedList<>();
        int n = image.length;
        int m = image[0].length;
        int ec = image[sr][sc];
        int[][] vis = new int[n][m]; 
        q.offer(new Pair(sr,sc));
        vis[sr][sc] =1;
        while(!q.isEmpty())
        {
           int r = q.peek().first;
           int c = q.peek().second;
            q.poll();
           for(int i=-1; i<=1; i++)
           {
               for(int j=-1; j<=1; j++)
               {
                   if(i != j && i != -j)
                   {
                      int nrow = r + i;
                      int ncol = c + j;
                       if(nrow >= 0 && nrow < n && ncol >=0 && ncol< m && image[nrow][ncol] == ec && vis[nrow][ncol] !=1)
                       {
                           vis[nrow][ncol] = 1;
                           q.offer(new Pair(nrow,ncol));
                       }
                   }
               }
           }
        }
        for(int i=0; i< n; i++)
        {
            for(int j=0; j<m ; j++)
            {
                if(vis[i][j]==1)
                    image[i][j] = color;
            }
        }
        return image;
    }
}