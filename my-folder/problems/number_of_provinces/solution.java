class Solution {
    public int findCircleNum(int[][] isConnected) {
        int province =0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<isConnected.length; i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0; i<isConnected.length; i++)
        {
            for(int j=0; j<isConnected[0].length; j++)
            {
                if(isConnected[i][j] ==1 && i != j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        int[] vis = new int[isConnected.length];
        for(int k=0; k<vis.length; k++)
        {
            if(vis[k]==0)
            {
                province++;
                dfs(k,vis,adj);
            }
        } 
        return province;
    }
    public void dfs(int node,int[] vis,ArrayList<ArrayList<Integer>> adj )
    {
        vis[node] =1;
        for(Integer it :adj.get(node) )
        {
            if(vis[it] ==0)
                dfs(it,vis,adj);
        }
    }
}