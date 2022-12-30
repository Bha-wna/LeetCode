class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> paths = new ArrayList<>();
        
        paths.add(0);
        dfs(0,graph, paths, ans);
        
        return ans;
    }
    
    public void dfs(int node,int[][] graph, List<Integer> paths,  List<List<Integer>> ans)
    {
        if(node== graph.length-1)
        {
            ans.add(new ArrayList<>(paths));
            return;
        }
        
        for(int it: graph[node])
        {
            paths.add(it);
            dfs(it,graph,paths,ans);
            paths.remove(paths.size()-1);
        }
    }
}