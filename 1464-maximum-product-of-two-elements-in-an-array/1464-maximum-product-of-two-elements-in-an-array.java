class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i : nums) {
            if (max <= i) {
                smax = max;
                max = i;
            } else if (max > i && smax < i) {
                smax = i;
            }
        }
        return (max - 1) * (smax - 1);
    }
}