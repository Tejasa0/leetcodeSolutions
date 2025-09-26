class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for (int i = n - 1; i >= 2; i--) {
            int k = i - 1;
            for (int j = 0; j < k; j++) {
                if (nums[j] + nums[k] > nums[i]) {
                    count += k - j;
                    k--;
                    j--;
                }
            }
        }
        return count;
    }
}