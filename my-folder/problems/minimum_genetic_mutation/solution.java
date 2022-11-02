class Pair
{
    String first;
    int second;
    public Pair(String first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int minMutation(String start, String end, String[] bank) {
        char [] characters = new char[]{'A','C','G','T'};
        Set<String> s = new HashSet<>();
        for(int i=0; i<bank.length; i++)
        {
            s.add(bank[i]);
        }
       // int mutation =0;  
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start,0));
     //   int temp =0;
        while(!q.isEmpty())
        {
            String word = q.peek().first;
            int mutation = q.peek().second;
            System.out.println("word : " + word);
            System.out.println("mutation : " + mutation);
            q.poll();
            
            for(int i=0; i<8; i++)
            {    
                for(int j=0; j<4; j++)
                {
                    char [] arr = word.toCharArray();
                    arr[i] = characters[j];
                    String newWord = new String(arr);
                   
                    if(s.contains(newWord))
                    {  System.out.println(newWord); 
                        if(newWord.equals(end))
                            return mutation+1 ;
                        s.remove(newWord);
                     System.out.println(mutation+1);
                     
                        q.offer(new Pair(newWord, mutation+1));
    System.out.println("m : " + q.peek().first);
                     System.out.println("m : " + q.peek().second);
                        
                    }
                }
            }
           // System.out.println(q);
        }
        return -1;
    }
}