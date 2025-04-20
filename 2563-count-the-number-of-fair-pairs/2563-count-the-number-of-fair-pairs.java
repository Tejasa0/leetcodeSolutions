class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            int left = lowerUpperBound(nums, i + 1, n - 1, lower - nums[i], true);
            int right = lowerUpperBound(nums, i + 1, n - 1, upper - nums[i], false);
            count += (right - left + 1);
        }

        return count;
    }

    private int lowerUpperBound(int[] nums, int start, int end, int target, boolean lowerUpperFlag) {
        if (lowerUpperFlag) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return start;
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] <= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return end;
        }
    }
}