// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         int currSum =nums[0], maxiSum = Integer.MIN_VALUE, i=0, n= nums.length;
//         if(n==1)
//             return currSum;
//         for(int j=1; j<=n; j++)
//         { 

//             if(j==n)
//             {
//               i=j;  
//               i = i%n;  
//             }
//             else
//                 i=j;
             
//             currSum += nums[i];
//             if(currSum <nums[i])
//                  currSum =nums[i];
//             if(currSum >maxiSum)
//                 maxiSum = currSum;
//             //i++;
//         }
//         return maxiSum;
//     }
// }
class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int nonCircularSum = kadaneMaxSum(A);
        int totalSum = 0;
        for(int i=0;i<A.length;i++){
            totalSum += A[i];
            A[i] = -A[i];
        }
              
        int circularSum = totalSum + kadaneMaxSum(A);
        if(circularSum == 0)
            return nonCircularSum;
        return Math.max(circularSum,nonCircularSum);
    }
    
    int kadaneMaxSum(int[] A){
        int currentSum = A[0];
        int maxSum = A[0];
        for(int i=1;i<A.length;i++){
            if(currentSum < 0)
                currentSum = 0;
            currentSum = A[i] + currentSum;
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}