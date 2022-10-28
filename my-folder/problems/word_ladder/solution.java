class Pair
{
    String first;
    int second;
    public Pair( String first,int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        Set<String > s = new HashSet<>();
        for(int i=0; i<wordList.size(); i++)
        {
            s.add(wordList.get(i));
        }
        s.remove(beginWord);
        int count=0;
        while(!q.isEmpty())
        {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.poll();    
            
            if(endWord.equals(word))
                return steps;
            
            for(int i=0; i<word.length();i++)
            {
                for(char ch ='a'; ch<='z';ch++)
                {
                    char[] arr = word.toCharArray();
                    arr[i] = ch;
                    String mWord = new String(arr);
                    if(s.contains(mWord))
                    {  s.remove(mWord);
                       q.offer(new Pair(mWord,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}