class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int n = accounts[i].length;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}