class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int min = -1;
        int max = -1;
        int invalidIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                invalidIndex = i;
            }
            if (nums[i] == minK) {
                min = i;
            }
            if (nums[i] == maxK) {
                max = i;
            }
            int currSafe = Math.min(min, max);
            if (currSafe > invalidIndex) {
                ans += currSafe - invalidIndex;
            }
        }
        return ans;
    }
}
