class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> curr : map.entrySet()) {
            if (curr.getKey() == curr.getValue())
                ans = Math.max(ans, curr.getKey());
        }
        return ans;
    }
}