class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        int n = s.length();
        int half = n / 2;
        for (int i = 0; i < half; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                for (int j = 0; j < freq[i]; j++) {
                    sb.append((char) (i + 'a'));
                }
            }
        }

        StringBuilder rev = new StringBuilder(sb).reverse();
        if (n % 2 == 1)
            rev.insert(0, s.charAt(half));
        return sb.append(rev).toString();

    }
}