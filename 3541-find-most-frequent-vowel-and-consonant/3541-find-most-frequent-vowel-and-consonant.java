class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[27];
        int vowelMax = 0;
        int conMax = 0;
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 27; i++) {
            if (i == 0 || i == 'e' - 'a' || i == 'i' - 'a' || i == 'o' - 'a' || i == 'u' - 'a')
                vowelMax = Math.max(vowelMax, freq[i]);
            else
                conMax = Math.max(conMax, freq[i]);
        }
        return conMax + vowelMax;
    }
}