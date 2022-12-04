class Solution {
    public long dividePlayers(int[] arr) {
        Arrays.sort(arr);
        int i=0; 
        int j = arr.length-1;
        
        int sum = arr[i]+ arr[j];
        long prod = arr[i]*arr[j];
        i++; j--;
        while(i<j)
        {
            if((arr[i] + arr[j])!=sum)
            {
                return -1;
            }
            prod += arr[i]*arr[j];
                i++;
                j--;
            
        }
        return prod;
    }
}