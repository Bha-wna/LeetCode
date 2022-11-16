class Pair
{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
       List<List<Pair>>adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        //adj stores node, dist
        for(int i=0; i<roads.length; i++)
        {
            adj.get(roads[i][0]).add(new Pair(roads[i][1], roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0], roads[i][2]));
        }
        int[] ways = new int[n];
        int dist[] = new int[n];
        
        for(int i=0; i<n;i++)
        {
            dist[i] = (int)1e18;
        }
        dist[0] =0;
        ways[0] =1;
        int mod = (int)(1e9 +7);
        //pq stores distance,node
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.first - b.first);
        pq.offer(new Pair(0,0));
        
        while(!pq.isEmpty())
        {
            int distance = pq.peek().first;
            int node = pq.peek().second;
            pq.poll();
            
            for(Pair p : adj.get(node))
            {
                int adjNode = p.first;
                int edW = p.second;
                if(distance + edW < dist[adjNode])
                {
                    dist[adjNode] = distance + edW;
                    pq.offer(new Pair(distance + edW,adjNode));
                    ways[adjNode] = ways[node];
                }
                else if(distance +edW == dist[adjNode])
                    ways[adjNode] = (ways[adjNode] + ways[node])%mod;
            }
        }
        return ways[n-1]%mod;      
    }
}
