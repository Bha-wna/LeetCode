class Solution {
    public int[] applyOperations(int[] nums) {
        
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int ans[] = new int [nums.length];
        int count = 0, i=0;
        for(int it: nums){
            if(it != 0){
                ans[i++] = it;
            } else{
                count++;
            }
        }
        int j=nums.length-1;
        while(count>0){
            ans[j--] =0;
            count--;
        }
        
        return ans;
        }
}
//         int count =0;
//         for(int i=0; i<nums.length-1; i++)
//         {
//             if(nums[i]== nums[i+1])
//             {
//                 nums[i] = 2*nums[i];
//                 nums[i+1] = 0;
//             }
//         }
//         System.out.println(Arrays.toString(nums));
       
// //         for(int i=0; i<nums.length; i++)
// //         {
// //             if(nums[i]==0)
// //                 count++;
// //         }
//         // int[] vis = new int[nums.length];
//         // for(int i=0; i<nums.length; i++)
//         // {   
//         //     if(nums[i]==0)
//         //     {
//         //         for(int j= i+1; j<nums.length; j++)
//         //         {
//         //             if(nums[j] !=0 && vis[j] !=1)
//         //             {
//         //                 nums[i] = nums[j];
//         //                 vis[j] =1;
//         //                 break;
//         //             }
//         //         }
//         //     }
//         // }
//         int[] vis = new int[nums.length];
//         for(int i=0; i<nums.length; i++)
//         {  if(nums[i]==0){
//             for(int j=i+1; j<nums.length; j++)
//             {
//                 if(nums[j] != 0 && vis[j]!=1)
//                 {  vis[j] =1;
//                     while(j>i)
//                     {
//                         nums[j-1]= nums[j];
//                         j--;
                       
//                     }
//                      break;
//                 }
//             }
//         }
//         }
        
//         // for(int i= nums.length-1; i>=count; i--)
//         // {
//         //     nums[i] = 0;
//         // }
//         return nums;
    