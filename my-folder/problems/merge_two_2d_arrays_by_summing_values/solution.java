class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0;
        int j=0,k=0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        
        
        List<List<Integer>> arr = new ArrayList<>();
        while(i <l1 && j <l2){
            List<Integer> temp = new ArrayList<>();
            if(nums1[i][0] < nums2[j][0])
            {
                temp.add(nums1[i][0]);
                temp.add(nums1[i][1]);
                i++;
            }
            else if(nums2[j][0]< nums1[i][0]){
                temp.add(nums2[j][0]);
                temp.add(nums2[j][1]);
                j++;
            }
            else
            {
                temp.add(nums1[i][0]);
                temp.add(nums2[j][1] + nums1[i][1]);
                i++;
                j++;
            }
            arr.add(temp);
        }
        if(i<l1)
        {
            while(i<l1)
            {
                List<Integer> temp = new ArrayList<>();
            
                temp.add(nums1[i][0]);
                temp.add(nums1[i][1]);
                i++;
               arr.add(temp);
            }
        }
        else if(j<l2){
               while(j<l2){
                List<Integer> temp = new ArrayList<>();

                temp.add(nums2[j][0]);
                temp.add(nums2[j][1]);
                j++;
                arr.add(temp);
               }
        }
        int[][] ans = new int[arr.size()][2];
        for(int i1=0; i1<arr.size(); i1++){
            ans[i1][0] = arr.get(i1).get(0);
            ans[i1][1] = arr.get(i1).get(1);
        }
        return ans;
    }
}