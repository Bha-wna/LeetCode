class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //A safe node is a node that is not part of cycle or is connected to cycle.
        int n = graph.length;
        int[] vis = new int[n];
        int[] pathvis = new int[n];
        List<Integer> safenodes = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            if(vis[i]==0)
                dfs(i,vis,pathvis,graph);
        }
        
        for(int i=0; i<n; i++)
        {
        if(pathvis[i]==0)
            safenodes.add(i);
        }
        
        return safenodes;
    }
    
    public boolean dfs(int node,int[] vis,int[] pathvis,int[][] graph )
    {
        vis[node] =1;
        pathvis[node] =1;
        
        for(int it: graph[node])
        {
            if(vis[it]==0)
            { 
                if(dfs(it,vis,pathvis,graph)==true)
                    return true;
            }
            else if(pathvis[it]==1)
                return true;
        }
        pathvis[node]=0;
        return false;
    }
}