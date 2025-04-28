class Solution {
    public long countSubarrays(int[] nums, long k) {
        int j = 0;
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (j <= i && (i - j + 1) * sum >= k) {
                sum -= nums[j];
                j++;
            }
            ans += i - j + 1;
        }
        return ans;
    }
}