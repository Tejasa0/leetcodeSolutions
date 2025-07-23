class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int[] prefix = new int[nums.length + 1];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        for (int curr = 0; curr < nums.length; curr++) {
            if (hm.containsKey(nums[curr])) {
                start = Math.max(start, hm.get(nums[curr]) + 1);
            }
            ans = Math.max(ans, prefix[curr + 1] - prefix[start]);
            hm.put(nums[curr], curr);
        }
        return ans;
    }
}