class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n > 1) {
            int i = 0;
            int j = 0;
            while (i < n && j < n) {
                while (i < n - 1 && nums[i] != 0)
                    i++;
                while (j < n - 1 && nums[j] == 0)
                    j++;
                if (j > i && nums[i] == 0 && nums[j] != 0) {
                    int curr = nums[i];
                    nums[i] = nums[j];
                    nums[j] = curr;
                } else
                    j++;
            }
        }
    }
}