class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int arr[]=new int[limit+1];
        int ans[]=new int[queries.length];
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<queries.length;i++)
        {
            int idx=queries[i][0];
            int col=queries[i][1];
            if(arr[idx]==0 && !(hm.containsKey(col) && hm.get(col)!=0))
            {
                count++;
            }
            else if(arr[idx]!=0 && hm.containsKey(col) && hm.get(col)!=0 && arr[idx]!=col)
            count--;
            else if(arr[idx]!=0 && hm.containsKey(col) && hm.get(col)==0 && arr[idx]!=col)
            count++;
            int cur=arr[idx];
            if(hm.containsKey(cur))
            hm.put(cur,hm.get(cur)-1);
            arr[idx]=col;
            ans[i]=count;
            if(hm.containsKey(col))
            hm.put(col,hm.get(col)+1);
            else
            hm.put(col,1);
        }
        return ans;
    }
}