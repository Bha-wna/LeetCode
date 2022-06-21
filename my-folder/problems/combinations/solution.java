class Solution {
    public List<List<Integer>> combine(int n, int k) {
      
        List<List<Integer>> al = new ArrayList<>();
        
        allCombinations(1, n, k, al, new ArrayList<>());
        
        return al;
    }
    
    public void allCombinations(int ind, int n, int k, List<List<Integer>> al, List<Integer> l)
    {
        if(k==0)
        {    al.add(new ArrayList<>(l));
          return;
        }

        // l.add(n);
        // allCombinations(ind,n--,k--,al,l); 
        for(int i=ind; i<=n;  i++)
        { 
           // if(i==ind) continue;
          l.add(i);
          allCombinations(i+1,n,k-1,al,l);
          l.remove(l.size()-1);
        }
    }
        
       //  allCombinations(ind++, n, k--,al,l);
        
//         if(ind == n)
//         {   
//            if(l.size()== k)
//               al.add(new ArrayList<>(l));
//             return;        }
        
//         if(ind != n)
//         {
//             l.add(ind);
//             l.add(n);
//             allCombinations(ind, n-1,k,al,l );
//             l.remove(l.size()-1);
//            // l.remove(l.size()-2);
//         } 
//         allCombinations(ind+1,n,k,al,l);
        
    
}