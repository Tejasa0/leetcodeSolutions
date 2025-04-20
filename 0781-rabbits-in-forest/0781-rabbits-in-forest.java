class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            hm.put(answers[i], hm.getOrDefault(answers[i], 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            int x = map.getKey();
            int count = map.getValue();
            int groupSize = x + 1;
            int numGroups = (count + x) / groupSize;
            ans += numGroups * groupSize;
        }
        return ans;
    }
}