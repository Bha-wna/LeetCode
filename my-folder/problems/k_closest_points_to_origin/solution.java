class Solution {
public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}






// class Solution {
//     public int[][] kClosest(int[][] points, int k) {
//         Map< List<Integer>, Double> m = new HashMap<>();
        
//         for(int i=0; i<points.length; i++)
//         {
//             int distx = points[i][0] ;
//             int disty = points[i][1] ;
//             double dist = Math.sqrt(distx*distx + disty*disty);
//             List<Integer> arr = new ArrayList<>();
//             arr.add(distx);
//             arr.add(disty);
            
//             m.put(arr, dist);
//         }
//         Map< List<Integer>, Double> sortedmap = new HashMap<>();
        
//         m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->sortedmap.put(x.getKey(), x.getValue()));
     
//         int[][] ans = new int[k][2];
//         int i=0;
//         System.out.println(sortedmap);
//         for(Map.Entry<List<Integer>, Double> entry : sortedmap.entrySet())
//         {
//             List<Integer> temp = entry.getKey();
//             ans[i][0] = temp.get(0);
//             ans[i][1] = temp.get(1);
//             k--;
//             i++;
//             if(k==0)
//                 break;
//         }
        
//         return ans;
//     }
// }