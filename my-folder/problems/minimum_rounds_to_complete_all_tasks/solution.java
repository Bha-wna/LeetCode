class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = tasks.length;
        for(int i=0; i<n; i++)
        {
            m.put(tasks[i], m.getOrDefault(tasks[i],0)+1);
        }
        
      //  System.out.println(m);
        int ct =0;
        for(Map.Entry<Integer, Integer> entry : m.entrySet())
        {
            if(entry.getValue()<2)
                return -1;
            else
            {
                int val = entry.getValue();
               // while()
                  
                  if(val !=0 && val%3==0)
                  {ct += val/3;
                   val = val%3;
                  // System.out.println("2 " + ct);
                  }
                  else
                  {
                      ct+=val/3 +1;
                      val = val/3;     
                  }
                  // if((val%3) ==2)
                  // { ct+= val/3;
                  //   val = val%3;
                  //   System.out.println("1 " + ct);
                  // }
                  // if(val !=0 && val%3==0)
                  // {ct+= val/3;
                  //  val = val%3;
                  //  System.out.println("2 " + ct);
                  // }
                  // if(val!=0  &&val%2==0)
                  // {ct+= val/2;
                  //  val = val%2;
                  //  System.out.println("3 " + ct);
                  // }
                  // if(val !=0 && val%3==1 && val%2==0)
                  // { ct += val/2;}
            
            }
            
        }
        return ct;
    }
}