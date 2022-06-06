class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> p = new ArrayList<List<Integer>>();
        
        int i=0;
        while(i<numRows)
        {
            List<Integer> l = new ArrayList<Integer>();
            
            if(p.size()<2)
            {
                int j=0;
                while(j<i+1)
                {
                    l.add(1); 
                    j++;
                }
                
            }
           
            else
            {
                int j=0;
                 int index=0;
                while(j<=p.size())
                {  
                    if(j==0 || j==p.size()) l.add(1);
                    else l.add((p.get(i-1).get(index++))+(p.get(i-1).get(index)));
                   j++;     
                }
            }
             i++;
            p.add(l);
          
        }
        return p;
    }
}