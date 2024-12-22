class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int len=heights.length;
        int len1=queries.length;
        int res[]=new int[len1];
        int count=0;
        for(int[] arr:queries)
        {
            int id1=arr[0];
            int id2=arr[1];
            if(id1==id2)
            {
                res[count]=id1;
                count++;
                continue;
            }
            if(id1<id2 && heights[arr[0]]<heights[arr[1]])
            {   
                res[count]=arr[1];
                count++;
                continue;
            }
            int counter;
            if(id1<=id2)
            {
                counter=id2;
                while(++id1<=counter)
                {
                    if(heights[arr[0]]<heights[id1] && heights[id1]<=heights[counter])
                    {
                        res[count]=counter;
                        break;
                    }
                }
            }
            else
            {
                counter=id1;
                while(++id2<=counter)
                {
                    if(heights[arr[1]]<heights[id2] && heights[id2]<=heights[counter])
                    {
                        res[count]=counter;
                        break;
                    }
                }
            }
            if(res[count]==0){
            while(++counter<len)
            {
                if(heights[arr[0]]<heights[counter] && heights[arr[1]]<heights[counter])
                {
                    res[count]=counter;
                    break;
                }
            }
            }
            if(res[count]==0)
            res[count]=-1;
            count++;
        }
        return res;
    }
}