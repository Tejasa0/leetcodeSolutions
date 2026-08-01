class Solution {
    int[][] dp;
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        return findAnswer(nums, 0, n - 1) >= 0;
    }
    private int findAnswer(int[] nums, int i, int j) {
        if (i == j)
            return nums[i];
        if (dp[i][j] != 0)
            return dp[i][j];
        return dp[i][j] = Math.max(nums[i] - findAnswer(nums, i + 1, j), nums[j] - findAnswer(nums, i, j - 1));
    }
}