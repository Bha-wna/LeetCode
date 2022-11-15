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
class Tuple
{
    int step;
    int nod;
    int distance;
    public Tuple(int step, int nod, int distance)
    {
        this.step = step;
        this.nod = nod;
        this.distance = distance;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //pair will store node,distance
        List<List<Pair>> adj = new ArrayList<>();
       for(int i=0; i<n; i++)
       {
           adj.add(new ArrayList<Pair>());
       }
        
       for(int i=0; i<flights.length; i++)
       {
           adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
       }
       
        //queue will store steps,node,dist
       Queue<Tuple> q = new LinkedList<>();
       q.offer(new Tuple(0,src,0)); 
        
        int[] dist = new int[n];
        for(int i=0; i<n; i++)
        {
            dist[i] = (int)1e9;
        }
        dist[src] = 0;
        //TC : E = flights.length;
        while(!q.isEmpty())
        {
            int st = q.peek().step;
            int node = q.peek().nod;
            int dis = q.peek().distance;
            q.poll();
            if(st>k) continue;
            
            for(Pair p : adj.get(node))
            {
                int adjNode = p.first;
                int adjDis = p.second;
                
                if(dis + adjDis <dist[adjNode] && st<=k)
                {
                    dist[adjNode] = dis + adjDis;
                    q.offer(new Tuple(st+1,adjNode,dis+adjDis));
                }      
            }    
        }
        if(dist[dst] == (int)1e9)
            return -1;
        return dist[dst];
        
       // System.out.println(adj);
       // return 0;
    }
}