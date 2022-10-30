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
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String, Integer> map_max = new HashMap<>();
        Map<String, Long> map = new HashMap<>();
        Map<String, ArrayList<Pair>> id = new HashMap<>();
        
        for(int i=0; i<ids.length; i++)
        {
            if(!map.containsKey(creators[i]))
                map.put(creators[i],(long)0);
            if(!map_max.containsKey(creators[i]))
                map_max.put(creators[i], 0);
            if(!id.containsKey(creators[i]))
                id.put(creators[i],new ArrayList<>());
            
            map.put(creators[i],map.get(creators[i])+ views[i]);
            map_max.put(creators[i], Math.max(map_max.get(creators[i]),views[i]));
            id.get(creators[i]).add(new Pair(ids[i],views[i]));
        }
        long maxi =0;
        for(long num : map.values())
        {
            maxi = Math.max(maxi,num);
        }
        
        List<List<String>> ans = new ArrayList<>();
        
        for(String key : map.keySet())
        {
            if(map.get(key)==maxi)
            {
                Collections.sort(id.get(key),(o1,o2) -> (o1.first.compareTo(o2.first)));
                for(Pair p : id.get(key))
                {
                    if(p.second == map_max.get(key))
                    {
                        ans.add(new ArrayList<>(Arrays.asList(key,p.first)));
                        break;
                    }
                }
            }
        }
        return ans;
        
        
    }
}
//         Map<String, Long> m = new HashMap<>();
//         Map<String, ArrayList<Long>> mi = new HashMap<>();
//         for(int i=0; i<creators.length; i++)
//         {
//             if(!m.containsKey(creators[i]))
//             {  m.put(creators[i],views[i]);

//                mi.put(creators[i],new ArrayList<>(i));
//             }
//             else
//             { m.put(creators[i],m.get(creators[i])+ views[i]);
//               mi.get(creators[i].add(i));
//             }
            
//         }
//        List<String> v = new ArrayList<>();
//        int maxi = Integer.MIN_VALUE;
//         for(Map.Entry<String, Pair> entry : m.entrySet())
//          {
//              if(maxi < entry.getValue())
//                  maxi = entry.getValue();
//          }
        
//         for(Map.Entry<String, Pair> entry1 : m.entrySet())
//          {
//              if(maxi == entry.getValue())
//              {
//                  v.add(entry.getKey(maxi));
//              }
//         }
        
//          Map<String, Integer> popularity = new HashMap<>();
//         for(int i=0; i<ids.length; i++)
//         {
//             if(!m.containsKey(creators[i]))
//                 m.put(creators[i],views[i]);
//             else
//                 m.put(creators[i],m.get(creators[i])+ views[i]);
//         }
//         int maxi = Integer.MIN_VALUE;
//         for(Map.Entry<String, Pair> entry : m.entrySet())
//          {
//              if(maxi < entry.getValue())
//                  maxi = entry.getValue();
//          }
        
//         List<List<String>> ans = new ArrayList<>();
//         for(Map.Entry<String, Pair> entry1 : m.entrySet())
//          {
//              if(maxi == entry.getValue())
//              {
//                  List<String> l = new ArrayList<>();
//                  l.add(entry.getKey(maxi));
//              }
//             ans.add(l);
//          }
        
//         for(int i=0; i<ans.size(); i++)
//         {
            
//         }
        // Map<String, Pair> m = new HashMap<>();
        // for(int i=0; i<ids.length; i++)
        // {
        //     if(!m.containsKey(creators[i]))
        //       m.put(creators[i],new Pair(ids[i],views[i]));
        //     else
        //     {
        //         int v = m.get(creators[i].second);
        //         // if view is same check for lexographically small
        //         if(views[i]==v)
        //         {
        //             int comp = ids[i].compareTo(m.get(creators[i].first));
        //             if(comp >0)
        //                 m.put(creators[i],new Pair(m.get(creators[i].first),views[i]));
        //             else if(comp<0)
        //                 m.put(creators[i],new Pair(ids[i],views[i]));
        //         }
        //         else if(views[i]>v)
        //         {
        //             m.put(creators[i],new Pair(creators[i],views[i]));
        //         }
        //     }
        // }
        // int maxi = Integer.MIN_VALUE;
        // for(Map.Entry<String, Pair> entry : m.entrySet())
        // {
        //     if(maxi < entry.getValue().second)
        //         maxi = entry.getValue().second;
        // }
        
       
//     }
// }