class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> allDistinct = new HashSet<>();
        for (int num : nums) {
            allDistinct.add(num);
        }
        int totalDistinct = allDistinct.size();
        int left = 0, count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);
            while (freqMap.size() == totalDistinct) {
                count += nums.length - right;
                int leftNum = nums[left];
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                left++;
            }
        }
        return count;
    }
}