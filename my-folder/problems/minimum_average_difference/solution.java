class Solution {
    public int minimumAverageDifference(int[] nums) {
      
	int len = nums.length, res = 0;
	long min = Integer.MAX_VALUE, sum = 0, leftSum = 0, rightSum = 0;
	for (int num : nums)
		sum += num;
	for (int i = 0; i < len; i++) {
		leftSum += nums[i];
		rightSum = sum - leftSum;
		long diff = Math.abs(leftSum / (i + 1) - (len - i == 1 ? 0 : rightSum / (len -i - 1)));
		if (diff < min) {
			min = diff;
			res = i;
		}
	}
	return res;
}
//         int n = nums.length;
       
//         if(n==1)
//             return 0;
//         long [] prefix = new long[n];
//         long[] suffix = new long[n];
        
//         prefix[0] = nums[0];
//         suffix[n-1] = nums[n-1];
//         for(int i=1; i<n; i++)
//         {
//             prefix[i] = prefix[i-1]+(long)nums[i];
//         }
//         for(int i=n-2; i>=0; i--)
//         {
//             suffix[i] = suffix[i+1]+(long)nums[i];
//         }
        
//      //   System.out.println(Arrays.toString(suffix));
//         double mini = Double.MAX_VALUE;
//         int index =0;
//         for(int i=0; i<n; i++)
//         {
//             double avg =0;
//             if(i==n-1)
//                avg = (prefix[i]*1.0)/((i+1)*1.0);
//             else
//                avg =Math.abs(((prefix[i]*1.0)/((i+1)*1.0)) -(((suffix[i]-nums[i])*1.0)/((n-i-1)*1.0)));     
//           // System.out.println(i + "..." + avg);
//            if(avg<mini)
//            {
//                mini = avg;
//                index =i;
//            }
//            // mini = Math.min(avg,mini);
//         }
//        return index;
//     }
}