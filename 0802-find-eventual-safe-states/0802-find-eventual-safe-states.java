class Solution {

    public boolean recFun(int node,int[][] adj,boolean[] visit,boolean[] inStack) 
    {
        if(inStack[node])
        {
            return true;
        }
        if(visit[node])
        {
            return false;
        }
        visit[node]=true;
        inStack[node]=true;
        for(int neighbor:adj[node]) {
            if (recFun(neighbor,adj,visit,inStack)) {
                return true;
            }
        }
        inStack[node]=false;
        return false;
    }

    public List<Integer>eventualSafeNodes(int[][] graph)
    {
        int n=graph.length;
        boolean[] visit=new boolean[n];
        boolean[] inStack=new boolean[n];

        for (int i=0;i<n;i++) {
            recFun(i,graph,visit,inStack);
        }

        List<Integer>ans=new ArrayList<>();
        for (int i=0;i<n;i++) {
            if (!inStack[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}