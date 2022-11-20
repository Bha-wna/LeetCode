class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long area1 = Math.abs(ax1-ax2) * Math.abs(ay1-ay2);
        long area2 = Math.abs(bx1-bx2) *Math.abs(by1-by2);
        int ol =0;
        int ob =0;
        
        long total_area = area1+ area2;
        System.out.println(total_area);
        
        int[] length = {ax1,ax2,bx1,bx2};
        int[] breadth = {ay1,ay2,by1,by2};
        Arrays.sort(length);
        Arrays.sort(breadth);
        ol = Math.abs(length[1]-length[2]);
        ob = Math.abs(breadth[1] - breadth[2]);
        long oarea = ol*ob;
        
        if(ax2<=bx1  || ax1>= bx2 || ay2<=by1 || ay1>= by2)
            return (int)total_area;
            
        
        System.out.println(oarea);
        
        return (int)(total_area - oarea);
        
        //find overlapped region
        //if a is in right
        // if(bx1 >= ax1 && bx1<= ax2)
        // {
        //     int ol = ax2-bx1;
        //     //find breadth
        //     if(by1 >= ay1 && by1 <= ay2)
        //     {
        //        ob = ay2-by1
        //         //ob = Math.abs(ay1-ay2) -(Math.abs(ay1-ay2)-Math.abs(by1-by2));
        //     }
        //     else if(by2 >= ay1 && by2 <= ay2)
        //     {
        //         ob = ay2 -(ay2 - by2);
        //     }
        // }
        
    }
}