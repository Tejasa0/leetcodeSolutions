class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                left = Math.max(left, hm.get(c));
            }
            hm.put(c, i + 1);
            if (i + 1 - left > max)
                max = i + 1 - left;

        }
        if (s.length() == hm.size())
            return hm.size();
        return max;

    }
}