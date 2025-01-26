class Solution {

    public int maximumInvitations(int[] favorite) {
        int size=favorite.length;
        int inD[]=new int[size];
        int chain[]=new int[size];
        boolean visited[]=new boolean[size];

        for(int i:favorite)
        inD[i]++;

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<size;i++)
        {
            if(inD[i]==0)
            q.add(i);
        }
        while(!q.isEmpty())
        {
            int curr=q.poll();
            visited[curr]=true;

            int next=favorite[curr];
            chain[next]=++chain[curr];
            if(--inD[next]==0)
            q.add(next);

        }

        int max=0;
        int tLength=0;
        for(int i=0;i<size;i++)
        {
            if(!visited[i])
            {
                int curr=i;
                int cLength=0;
                while(!visited[curr])
                {
                    visited[curr]=true;
                    curr=favorite[curr];
                    cLength++;
                }
                if(cLength==2)
                tLength+=2+chain[i]+chain[favorite[i]];
                else
                max=Math.max(max,cLength);
            }
        }
        return Math.max(max,tLength);
    }
}
