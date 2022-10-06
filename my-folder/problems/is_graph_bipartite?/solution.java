class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] color = new int[graph.length];
        for(int i=0; i<n; i++) color[i] =-1;
        
        for(int i=0; i<n; i++)
        {
            if(color[i]==-1)
            {  if(dfs(i,0, graph, color)== false)
                  return false;
            }
        }
        return true;
    }
    public static boolean dfs(int start, int col,int[][] graph,int [] color)
    {
        color[start] = col;
        for(Integer it: graph[start])
        {
            if(color[it]==-1)
            {
                if(dfs(it, 1-col, graph, color)== false)
                    return false;
            }
            else if(color[it]==color[start]) return false;
        }
        return true;
    }
}