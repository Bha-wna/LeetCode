class Solution {
    // public int findKthPositive(int[] arr, int k) {
    //       int i=0, val=0;
    //       List<Integer>missing = new ArrayList<>();
    //        while(missing.size()<=k){
    //            if(i<arr.length && arr[i]==val+1)
    //              i++;
    //            else
    //             { missing.add(val+1); 
    //               while(val+1<arr[i])
    //               i++;
    //             } 
    //        }
    //        return missing.get(missing.size()-1);
    //     }
    // }
        public int findKthPositive(int[] A, int k) {
        int l = 0, r = A.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }
}
