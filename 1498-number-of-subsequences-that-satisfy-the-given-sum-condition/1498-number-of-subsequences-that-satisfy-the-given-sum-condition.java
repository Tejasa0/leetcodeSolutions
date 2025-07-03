class Solution {
    public int numSubseq(int[] nums, int target) {
        final int mod = 1_000_000_007;
        int length = nums.length;
        Arrays.sort(nums);
        long[] pow = new long[length + 1];
        pow[0] = 1;
        for (int i = 1; i <= length; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }
        long ans = 0;
        int i = 0, j = length - 1;
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                ans = (ans + pow[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }
        return (int) ans;
    }
}