class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 0;
        for (int curr : nums) {
            if (curr == 0)
                i++;
            else if (curr == 1)
                j++;
            else
                k++;
        }
        int curr = 0;
        while (i-- > 0) {
            nums[curr++] = 0;
        }
        while (j-- > 0) {
            nums[curr++] = 1;
        }
        while (k-- > 0) {
            nums[curr++] = 2;
        }

    }
}