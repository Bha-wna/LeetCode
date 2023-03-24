class Solution {
    public int minReorder(int n, int[][] connections) {
        
        List<List<Integer>> forward = new ArrayList<>();
        List<List<Integer>> backward = new ArrayList<>();
         for(int i=0; i<n; i++){
             forward.add(new ArrayList<>());
             
             backward.add(new ArrayList<>());
         }
        
        for(int i=0; i<connections.length; i++){
             forward.get(connections[i][0]).add(connections[i][1]);
             backward.get(connections[i][1]).add(connections[i][0]);
        }
       
        int[] vis = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
       // vis[0]=1;
        
        int ans =0;
        
        while(!q.isEmpty()){
            int node = q.poll();
            vis[node]=1;
            
            for(int it: forward.get(node)){
                if(vis[it]==0)
                {
                    q.offer(it);
                    ans++;
                }
            }
            for(int it: backward.get(node)){
                if(vis[it]==0){
                    q.offer(it);
                }
            }   
        }
        return ans;
    }
}