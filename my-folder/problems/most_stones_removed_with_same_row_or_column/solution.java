class Solution {
    Map<Integer, Integer> f = new HashMap<>();
    int islands = 0;

    public int removeStones(int[][] stones) {
   
        for (int i = 0; i < stones.length; ++i)
            union(stones[i][0], ~stones[i][1]);
        return stones.length - islands;
    }

    public int find(int x) {
        if (f.putIfAbsent(x, x) == null)
            islands++;
        if (x != f.get(x))
            f.put(x, find(f.get(x)));
        return f.get(x);
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            f.put(x, y);
            islands--;
        }
    }
}
// class Solution {
//     public int removeStones(int[][] stones) {
//         int ct =0;
//         int n = stones.length;
//       // int m = stones[0].length;   
//        // int[][] grid = new int[r+1][c+1];
//         int r=0;
//         int c=0;
//         for(int i=0; i<n; i++)
//         {
//            if(stones[i][0]>r)
//                r = stones[i][0];
            
//             if(stones[i][1]>c)
//                 c = stones[i][1];
//         }
//         int[][] grid = new int[r+1][c+1];
//         int[][] vis = new int[r+1][c+1];
//         for(int i=0; i<n; i++)
//         {
//             grid[stones[i][0]][stones[i][1]]= 1;
//         }
//         System.out.println(Arrays.deepToString(grid));
        
//         for(int i=0;i<r+1; i++)
//         {
//             for(int j=0; j<c+1; j++)
//             {
//                 if(grid[i][j]==1)
//                 {
//                     for(int y=0; y<c+1;y++)
//                     { if(vis[i][j] !=1 && grid[i][y]==1 && vis[i][y]!=1)
//                       {  vis[i][j]=1;
//                          ct++;
//                          System.out.println(" 1 i " + i+ " j "+j + " y " + y);
//                       }
//                     }
//                     for(int z=0; z<r+1;z++)
//                     { if(vis[i][j] !=1 && grid[z][j]==1 && vis[z][j]!=1)
//                       { vis[i][j]=1;
//                         ct++;
//                        System.out.println("2 i " + i+ " j "+j);
//                       }
//                     }
//                 }
//             }
//         }
//         return ct;
//     }
// }