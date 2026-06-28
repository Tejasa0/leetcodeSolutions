class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return new int[] { nums[0] };
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}