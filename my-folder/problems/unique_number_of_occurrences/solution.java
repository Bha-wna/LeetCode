class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> m = new HashMap<>();
        for(int it : arr)
        {
            m.put(it, m.getOrDefault(it,0)+1);
        }
        System.out.println(m);
        ArrayList<Integer> a = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(a.contains(entry.getValue()))
                return false;
            a.add(entry.getValue());
        }
        return true;
    }
}