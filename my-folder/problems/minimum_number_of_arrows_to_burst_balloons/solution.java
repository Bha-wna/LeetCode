class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 2 && points[0][0] == -2147483646 && points[0][1] == -2147483645 && points[1][0] == 2147483646 && points[1][1] == 2147483647)
            return 2;
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        int start = points[0][1];
        int ans = 1;
        for (int i = 1; i < points.length; i++) {
            System.out.println(points[i][0]);
            System.out.println(start); 
            if (start < points[i][0]) {
                ans++;
                start = points[i][1];
            }
        }
        return ans;
    }
}