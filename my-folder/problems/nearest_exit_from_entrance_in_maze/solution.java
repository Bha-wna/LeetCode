class Pair
{
    int first ;
    int second;
    int third ;
    public Pair(int first, int second, int third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        //queue will store coordinates along with steps
        int n = maze.length;
        int m = maze[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(entrance[0],entrance[1],0));
        List<Integer> steps = new ArrayList<>();
        
       int vis[][] = new int[maze.length][maze[0].length];
        vis[entrance[0]][entrance[1]] =1;
        
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;
            
            q.poll();
            for(int i=-1; i<=1; i++)
            {
                for(int j=-1; j<=1; j++)
                {
                    if(i != j && i != -j)
                    {
                        int nrow = row +i;
                        int ncol = col + j;
                        if(nrow >=0 && nrow <n && ncol >=0 && ncol < m && vis[nrow][ncol] != 1 && maze[nrow][ncol]=='.')
                        {
                            vis[nrow][ncol] =1;
                            q.offer(new Pair(nrow,ncol,step+1));
                            if(nrow == n-1 || ncol == m-1 || nrow ==0 || ncol ==0)
                                return step+1;
                        }
                    }
                }
            }
        }
        // int ans = Integer.MAX_VALUE;
        // for(int i=0; i<steps.size(); i++)
        // {
        //     ans = Math.min(ans,steps.get(i));
        // }
        // if(ans == Integer.MAX_VALUE) return -1;
        return -1;
    }
}