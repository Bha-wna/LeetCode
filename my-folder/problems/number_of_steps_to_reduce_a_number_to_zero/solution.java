class Solution {
    public int numberOfSteps(int num) {
       int steps =0; 
        for(int i=1; num >0; i++)
        {
          if(num%2==0)  
          {
            num = num/2;  
          }
          else
          {
              num = num-1;
          }
          steps = i;
        }
        return steps;
    }
}