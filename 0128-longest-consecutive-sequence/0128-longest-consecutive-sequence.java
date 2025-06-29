class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int currCount = 0;
        if (nums.length < 2)
            return nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0)
                currCount = 1;
            if (nums[i] + 1 == nums[i + 1])
                currCount++;
            else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                ans = Math.max(ans, currCount);
                currCount = 1;
            }
        }
        ans = Math.max(ans, currCount);
        return ans;
    }
}