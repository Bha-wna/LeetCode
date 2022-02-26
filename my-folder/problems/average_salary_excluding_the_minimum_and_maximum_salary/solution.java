class Solution {
    public double average(int[] salary) {
      int max= Integer.MIN_VALUE;
      int min= Integer.MAX_VALUE;
        double sum=0;
        for(int i=0; i<salary.length; i++)
        {
            if(max < salary[i])
                max =salary[i];
        }
        for(int i=0; i<salary.length; i++)
        {
          if(min> salary[i])
              min = salary[i];     
        }
        for(int i=0; i<salary.length; i++)
        {
            if(salary[i]==min||salary[i]==max)
                continue;
            else
               sum= sum+salary[i];
        }
        sum =sum/(salary.length -2);
        return sum;
    }
}