class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int j = y; j < y + k; j++) {
            for (int i = 0; i < k / 2; i++) {
                int curr = grid[x + i][j];
                System.out.println(curr);
                grid[x + i][j] = grid[x + k - i - 1][j];
                grid[x + k - i - 1][j] = curr;
            }
        }
        return grid;
    }
}