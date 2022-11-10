class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Character> charSt = new Stack<Character>();
        Stack<Integer> indSt = new Stack<>();
        indSt.push(-1);
        List<Integer> len = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==')')
            {
               if(charSt.isEmpty()) 
                   indSt.push(i);
                else if(charSt.peek() =='(')
                {
                    indSt.pop();
                    charSt.pop();
                    len.add(i-indSt.peek());
                }
            }
            else if(s.charAt(i)=='(')
            {
               charSt.push('(');
               indSt.push(i); 
            }
        }
       int max = 0;
        for(int i=0; i<len.size(); i++)
        {
            max = Math.max(max, len.get(i));
        }
       return max; 
    }
}