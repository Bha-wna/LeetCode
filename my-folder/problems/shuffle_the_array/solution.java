class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0; int j=n, k =0;
        int [] arr = new int[2*n];
        
        while(i<n && j<2*n){
            arr[k++]= nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }
}