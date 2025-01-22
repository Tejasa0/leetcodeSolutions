class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r=isWater.length;
        int c=isWater[0].length;
        int [][] ans=new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                ans[i][j]=r+c; 
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(isWater[i][j]==1)
                ans[i][j]=0;
                else
                {
                    if(i>0)
                    ans[i][j]=Math.min(ans[i][j],ans[i-1][j]+1);
                    if(j>0)
                    ans[i][j]=Math.min(ans[i][j],ans[i][j-1]+1);
                }
            }
        }
        for(int i=r-1;i>-1;i--)
        {
            for(int j=c-1;j>-1;j--)
            {
                if(i<r-1)
                ans[i][j]=Math.min(ans[i][j],ans[i+1][j]+1);
                if(j<c-1)
                ans[i][j]=Math.min(ans[i][j],ans[i][j+1]+1);
            }
        }   
        return ans;
    }
}