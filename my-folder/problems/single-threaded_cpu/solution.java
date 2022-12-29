class Solution {
    public int[] getOrder(int[][] tasks) {
               int l = tasks.length;

        Task[]  arr = new Task[l];

        for(int i=0;i<l;i++)
        {
            arr[i] = new Task(i,tasks[i][0],tasks[i][1]);
        }

        Arrays.sort(arr,(a,b)->{
            return Integer.compare(a.eqtime,b.eqtime);
        });

        PriorityQueue<Task> pq = new PriorityQueue<>((a,b)->{
            if(a.protime==b.protime)
            {
                return Integer.compare(a.index,b.index);
            }
            return Integer.compare(a.protime,b.protime);
        });

        int ans[] = new int[l];
        int ansi=0;
        int taski=0;
        int curTime=0;

        while(ansi<l)
        {
            while(taski<l && arr[taski].eqtime<=curTime)
            {
                pq.offer(arr[taski++]);
            }
            if(pq.isEmpty())
            {
                curTime=arr[taski].eqtime;
            }
            else
            {
                curTime += pq.peek().protime;
                ans[ansi++]=pq.poll().index;

            }
        }
        return ans;

    }
    class Task
    {
        int index;
        int eqtime;
        int protime;

        Task(int i,int eq,int pro)
        {
            this.index=i;
            this.eqtime=eq;
            this.protime=pro;
        }
    }
}