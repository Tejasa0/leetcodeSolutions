class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1]) {
                int left = 0;
                int curr = i - 1;
                while (curr >= 0) {
                    if (nums[curr] > nums[i]) {
                        left = 1;
                        break;
                    } else if (nums[curr] < nums[i]) {
                        left = 2;
                        break;
                    }
                    curr--;
                }
                int right = 0;
                curr = i + 1;
                while (curr < nums.length) {
                    if (nums[curr] > nums[i]) {
                        right = 1;
                        break;
                    } else if (nums[curr] < nums[i]) {
                        right = 2;
                        break;
                    }
                    curr++;
                }
                if (left != 0 && right == left)
                    ans++;
            }
        }
        return ans;
    }
}