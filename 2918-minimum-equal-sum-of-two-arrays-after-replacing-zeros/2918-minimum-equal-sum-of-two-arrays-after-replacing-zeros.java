class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        int zero1 = 0;
        int zero2 = 0;
        for (int i : nums1) {
            if (i == 0)
                zero1++;
            else
                sum1 += i;
        }
        for (int i : nums2) {
            if (i == 0)
                zero2++;
            else
                sum2 += i;
        }
        if ((sum1 + zero1 > sum2 && zero2 == 0) || (sum1 < sum2 + zero2 && zero1 == 0))
            return -1;
        sum1 += zero1;
        sum2 += zero2;
        return sum1 > sum2 ? sum1 : sum2;
    }
}