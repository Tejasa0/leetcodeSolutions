class Solution {
    public int maxDifference(String s) {
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for (int i : freq) {

            if ((i & 1) != 0) {
                if (i > odd)
                    odd = i;
            } else {
                if (i < even && i > 1)
                    even = i;
            }
        }
        return odd - even;
    }
}