class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1_000_000_007;
        long[] count = new long[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int step = 0; step < t; step++) {
            long[] next = new long[26];
            for (int i = 0; i < 25; i++) {
                next[i + 1] = (next[i + 1] + count[i]) % MOD;
            }
            next[0] = (next[0] + count[25]) % MOD;
            next[1] = (next[1] + count[25]) % MOD;
            count = next;
        }

        long ans = 0;
        for (long c : count) {
            ans = (ans + c) % MOD;
        }
        return (int) ans;
    }
}