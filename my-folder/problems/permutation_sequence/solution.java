class Solution {
    public String getPermutation(int n, int k) {
      int fact =1;
       k=k-1;
       ArrayList<Integer> arr  = new ArrayList<>();
       for(int i=1; i<n; i++)
       {
           fact = fact*i;
           arr.add(i);
       }
       arr.add(n);
       String ans ="";
        
       while(true)
       {
        // try{
           ans =ans + arr.get(k/fact);
           arr.remove(k/fact);
        // }
//        catch(ArithmeticException e)
//          {
//              System.out.println("can't be divided by zero");
//          }
           
           if(arr.size()==0)
               break;
           
          k= k%fact;
          fact = fact/arr.size();
       }
      return ans;  
    }
}