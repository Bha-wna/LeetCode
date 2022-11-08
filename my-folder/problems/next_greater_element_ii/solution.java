class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int count =0;
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1; i>=0; i--)
        {
            while(!st.isEmpty() && st.peek() <= nums[i%n])
            {
                st.pop();
                System.out.println(count++);
            }
            if(i<n)
            {
                if(!st.isEmpty())
                  ans[i] = st.peek();
                else
                    ans[i] = -1;
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
}