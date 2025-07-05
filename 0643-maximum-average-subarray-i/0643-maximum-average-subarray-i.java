class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = Integer.MIN_VALUE;
        double sum1 = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            count++;
            if (count == k) {
                if ((sum1 / k) > sum) {
                    sum = (sum1 / k);
                }

                sum1 -= nums[i - k + 1];
                count -= 1;

            }
        }
        return sum;
    }
}