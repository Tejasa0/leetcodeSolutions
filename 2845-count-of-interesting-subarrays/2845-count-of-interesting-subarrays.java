class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long ans = 0;
        Map<Integer, Long> countMap = new HashMap<>();
        countMap.put(0, (long) 1);
        int prefix = 0;
        for (int num : nums) {
            if (num % modulo == k)
                prefix++;
            int mod = prefix % modulo;
            int need = (mod - k + modulo) % modulo;
            ans += countMap.getOrDefault(need, (long) 0);
            countMap.put(mod, countMap.getOrDefault(mod, (long) 0) + 1);
        }
        return ans;
    }
}
