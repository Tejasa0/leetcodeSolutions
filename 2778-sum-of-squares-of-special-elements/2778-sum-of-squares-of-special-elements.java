class Solution {
    public int sumOfSquares(int[] nums) {
        int size = nums.length;
        int ans = 0;
        for (int n = 0; n < size; n++) {
            if (size % (n + 1) == 0)
                ans += nums[n] * nums[n];
        }
        return ans;
    }
}