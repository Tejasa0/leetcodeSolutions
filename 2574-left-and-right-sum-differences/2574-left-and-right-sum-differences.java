class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        int ans[] = new int[n];
        int lSum = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(lSum - (sum - nums[i] - lSum));
            lSum += nums[i];
        }
        return ans;
    }
}