import java.util.Collections;
import java.util.Arrays;

class Solution {
    public int maxScore(int[] nums) {
       Arrays.sort(nums);
        reverse(nums);
        
        int count=0;
        long sum =0;
        for(int it:nums){
            sum +=it;
            if(sum>0)
                count++;
            else
                break;
        }
        
        return count;
    }
     public static void reverse(int[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            int temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
}