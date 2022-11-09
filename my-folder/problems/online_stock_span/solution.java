class StockSpanner {
    Stack<Integer> st = new Stack<>();
    Map<Integer, Integer> m = new HashMap<>();
    
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        if(st.isEmpty())
        {
            st.push(price);
            m.put(price,1);
            return m.get(price);
        }
        else
        {
            int count =0;
            while(!st.isEmpty() && price >= st.peek())
            {
               count += m.get(st.peek());
                st.pop();
            }
            st.push(price);
            m.put(price,count+1);
            return m.get(price);
        }
       // return 0;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */