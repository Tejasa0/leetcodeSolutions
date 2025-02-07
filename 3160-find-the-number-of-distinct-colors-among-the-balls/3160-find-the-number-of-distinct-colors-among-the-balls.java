class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer>countHm=new HashMap<>();
        HashMap<Integer,Integer>idxHm=new HashMap<>();
        int len=queries.length;
        int ans[]=new int[len];
        int i=0;
        for(int[] query:queries)
        {
            int idx=query[0];
            int col=query[1];
        
            if(idxHm.containsKey(idx))
            {
                int existCol=idxHm.get(idx);
                //countHm.put(existCol,countHm.get(existCol)-1);
                if(countHm.get(existCol)==1)
                countHm.remove(existCol);
                else
                countHm.put(existCol,countHm.get(existCol)-1);
            }
            idxHm.put(idx,col);
            countHm.put(col,countHm.getOrDefault(col,0)+1);
            ans[i++]=countHm.size();
            
        }
        return ans;
    }
}