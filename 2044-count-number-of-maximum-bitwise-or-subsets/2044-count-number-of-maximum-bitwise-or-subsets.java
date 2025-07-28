class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxPossible = 0;
        for (int i : nums)
            maxPossible |= i;
        return count(0, 0, nums, maxPossible);
    }

    public int count(int idx, int currMax, int nums[], int maxPossible) {
        if (idx == nums.length) {
            if (currMax == maxPossible)
                return 1;
            else
                return 0;
        }
        return count(idx + 1, currMax, nums, maxPossible) + count(idx + 1, currMax | nums[idx], nums, maxPossible);
    }
}