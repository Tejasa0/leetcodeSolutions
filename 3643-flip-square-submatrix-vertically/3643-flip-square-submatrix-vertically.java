class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int last;
        for (int j = y; j < y + k; j++) {
            last = x + k - 1;
            for (int i = 0; i < k / 2; i++) {
                int curr = grid[x + i][j];
                System.out.println(curr);
                grid[x + i][j] = grid[last - i][j];
                grid[last - i][j] = curr;
            }
        }
        return grid;
    }
}