import java.util.*;

public class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int currCount = 0;
        int left = 0;
        for (int right : nums) {
            if (right == max)
                currCount++;
            while (currCount == k) {
                if (nums[left] == max)
                    currCount--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}
