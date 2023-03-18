class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        Queue<Tuple> q = new LinkedList<>();
        Set<Pair> s = new HashSet<>();
        
        for(int i=0; i<graph.length; i++){
            q.offer(new Tuple(i,1<<i,0));
            s.add(new Pair(i,1<<i));
        }
        
        while(!q.isEmpty()){
            Tuple t = q.poll();
            int v = t.value;
            int m = t.mask;
            int d = t.distance;
            
            if(m== (1<<n)-1)
                return d;
            
            for(int it : graph[v]){
                
                int mask = m | (1<<it);
                Pair p = new Pair(it,mask);
                if(!s.contains(p)){
                    q.offer(new Tuple(it,mask,d+1));
                    s.add(p);
                }
            }
        }
        return 1;
    }
}

class Tuple{
    int value;
    int mask;
    int distance;
    
    public Tuple(int value, int mask, int distance){
        this.value = value;
        this.mask = mask;
        this.distance = distance;
    }
}
class Pair{
    int val;
    int bitmask;
    public Pair(int val, int bitmask){
        this.val = val;
        this.bitmask = bitmask;
    }
    
    public boolean equals(Object o){
        Pair p = (Pair)o;
        return bitmask == p.bitmask && val == p.val;
    }
    
    public int hashCode(){
        return 31 * bitmask + 19 * val;
    }
}




