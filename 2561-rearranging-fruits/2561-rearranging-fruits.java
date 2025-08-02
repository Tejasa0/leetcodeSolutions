class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> mp = new HashMap<>();
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < basket1.length; i++) {
            minimum = Math.min(basket1[i], minimum);
            mp.put(basket1[i], mp.getOrDefault(basket1[i], 0) + 1);
        }
        for (int i = 0; i < basket2.length; i++) {
            minimum = Math.min(basket2[i], minimum);
            mp.put(basket2[i], mp.getOrDefault(basket2[i], 0) - 1);
        }
        System.out.println(mp);
        List<Integer> finalList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int freq = entry.getValue();
            if (freq % 2 != 0)
                return -1;
            int curr = 0;
            while (curr < Math.abs(freq) / 2) {
                finalList.add(entry.getKey());
                curr++;
            }
        }
        Collections.sort(finalList);
        System.out.println(finalList);
        long ans = 0;
        for (int i = 0; i < finalList.size() / 2; i++) {
            ans += Math.min(2 * minimum, finalList.get(i));
        }
        return ans;
    }
}