class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
        }

        List<Integer> curs = new LinkedList<>(); // store current layer
        curs.add(0);
        Set<Integer> visited = new HashSet<>();
        int step = 0;

        // when current layer exists
        while (!curs.isEmpty()) {
            List<Integer> nex = new LinkedList<>();

            // iterate the layer
            for (int node : curs) {
                // check if reached end
                if (node == n - 1) {
                    return step;
                }

                // check same value
                for (int child : graph.get(arr[node])) {
                    if (!visited.contains(child)) {
                        visited.add(child);
                        nex.add(child);
                    }
                }

                // clear the list to prevent redundant search
                graph.get(arr[node]).clear();

                // check neighbors
                if (node + 1 < n && !visited.contains(node + 1)) {
                    visited.add(node + 1);
                    nex.add(node + 1);
                }
                if (node - 1 >= 0 && !visited.contains(node - 1)) {
                    visited.add(node - 1);
                    nex.add(node - 1);
                }
            }

            curs = nex;
            step++;
        }

        return -1;
    }
}
// class Solution {
//     public int minJumps(int[] arr) {
//         int n = arr.length;
        
//         //value && index
//         Map<Integer, List<Integer>> m = new HashMap<>();
//         for(int i=0; i<n; i++){
//             if(!m.containsKey(arr[i]))
//             {
//                 List<Integer> temp = new ArrayList<>();
//                 temp.add(i);
//                 m.put(arr[i],temp);
//             }
//             else
//             {
//                 m.get(arr[i]).add(i);
//             }
//         }
        
//        // System.out.println(m);
        
//         List< Set<Integer>> adjList = new ArrayList<>();
//         for(int i=0; i<n;i++){
//             adjList.add(new HashSet<>());
//         }
        
        
//         for(int i=0; i<n; i++){
//             if(i==0){
//                 adjList.get(i).add(i+1);
//                 List<Integer> temp = m.get(arr[i]);
//                 for(int j =0; j<temp.size(); j++){
//                     adjList.get(i).add(temp.get(j));
//                 }
//             }
//             else if(i==n-1){
//                 adjList.get(i).add(i-1);
//                 List<Integer> temp = m.get(arr[i]);
//                 for(int j =0; j<temp.size(); j++){
//                     adjList.get(i).add(temp.get(j));
//                 }
//             }
//             else{
//                 adjList.get(i).add(i+1);
//                 adjList.get(i).add(i-1);
//                 List<Integer> temp = m.get(arr[i]);
//                 for(int j =0; j<temp.size(); j++){
//                     adjList.get(i).add(temp.get(j));
//                 }
//             }     
//         }
//         System.out.println(adjList);
        
//         return bfs(adjList,n);
//         //return 0;
//     }
//     public static int bfs(List< Set<Integer>> adjList, int n){
//         boolean vis[] = new boolean[n];
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);
//         vis[0]= true;
//         int count =0;
        
//         while(!q.isEmpty()){
//            Integer node = q.poll();
//            count++;
//            if(it==n-1)
//               return count;
//             for(Integer it: adjList.get(node)){
//                 if(vis[it]==false){
//                     vis[it] = true;
//                     q.add(it);    
//                 }
//             }
//         }
//        return count; 
//     }
// }