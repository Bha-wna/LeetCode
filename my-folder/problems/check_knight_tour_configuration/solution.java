class Solution {
    public boolean checkValidGrid(int[][] grid) {
        
        int []dirx ={-2,-1,1,2,-2,-1,1,2};
        int []diry ={-1,-2,-2,-1,1,2,2,1};
        
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] vis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,0,0));
        vis[0][0] =1;
        
        while(!q.isEmpty()){
            int row = q.peek().r;
            int col = q.peek().c;
            int val = q.peek().v;
            
            q.poll();
            for(int i=0;i<8; i++){
                int nr = row + dirx[i];
                int nc = col + diry[i];
                if(nr >=0 && nc>=0 && nr <n && nc <m && vis[nr][nc]==0 && grid[nr][nc]== val+1){
                    q.offer(new Pair(nr,nc,val+1));
                    vis[nr][nc] =1;
                }
            }   
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0)
                    return false;
            }
        }
        return true;
    }
}
class Pair{
    int r;
    int c;
    int v;
    public Pair(int r, int c,int v){
        this.r = r;
        this.c = c;
        this.v = v;
    }
}