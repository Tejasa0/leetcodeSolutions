class Solution {
    boolean[][] visited;
    int[][] dir={ {0,1},{0,-1}, {1,0},{-1,0} };
    public int findMaxFish(int[][] grid)
    {
        int ans=0;
        int r=grid.length;
        int c=grid[0].length;       
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==0) continue;
                visited=new boolean[r][c];                 
                ans=Math.max(ans, dfs(grid, i, j, r, c));
            }
        }
        return ans;
    }
    int dfs(int[][] grid, int i, int j, int r, int c){
        visited[i][j]=true;
        int count=0;
        if(grid[i][j]==0)
        return count;
        count+=grid[i][j];
        for(int[] cuurDir:dir)
        {
            int nr=i+cuurDir[0];
            int nc=j+cuurDir[1];
            if(nr>=0 && nr<r && nc>=0 && nc<c)
            {
                if(!visited[nr][nc])
                {                           
                    count+=dfs(grid, nr, nc, r, c);
                }
            }
        } 
        return count;
    }

}