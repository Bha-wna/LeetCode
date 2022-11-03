class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int i=0;
        int j =0;
        int len1 = firstList.length;
        int len2 = secondList.length;
        
        while( i<len1 && j <len2 )
        {
            int num1 = Math.max(firstList[i][0], secondList[j][0]);
            int num2 = Math.min(firstList[i][1], secondList[j][1]);
            if(num1<= num2)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(num1);
                temp.add(num2);
                ans.add(temp);
            }
            if(firstList[i][1]< secondList[j][1])
                i++;
            else
                j++;
        }
        int s = ans.size();
        int[][] arr = new int[s][2];
        for(int k=0; k<ans.size(); k++)
        {
            arr[k][0] = ans.get(k).get(0);
            arr[k][1] = ans.get(k).get(1);
        }
        return arr;
    }
}