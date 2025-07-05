class Solution {
    public int longestSubarray(int[] nums) {
        int used = -1;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else {
                if (used != -1)
                    count = i - used;
                used = i + 1;
            }
            ans = Math.max(count, ans);
        }
        ans = Math.max(count, ans);
        if (used == -1)
            return ans - 1;
        return ans;
    }
}