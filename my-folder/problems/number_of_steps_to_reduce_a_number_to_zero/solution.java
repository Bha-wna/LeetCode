class Solution {
    public int numberOfSteps(int num) {
        Stack<Integer> s = new Stack<>();
         s.push(num);
        while(s.peek()!=0)
        {
        // int temp = s.peek();   
         if((s.peek())% 2==0)
             s.push(s.peek()/2);
         else
             s.push(s.peek()-1);
            
        }
        return s.size()-1;
    }
}