class Solution {
    public int numberOfSpecialChars(String word) {
        int[] count = new int[26];
        int[] count1 = new int[26];
        int j = 1;
        for (char c : word.toCharArray()) {
            int s = c - 'a';
            int b = c - 'A';
            if (s > -1 && s < 26) {

                count[s] = j;

            }
            if (b > -1 && b < 26) {
                if (count1[b] == 0)
                    count1[b] = j;

            }
            j++;
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i]!= 0 && count[i] < count1[i]) {
                ans++;
            }
        }
        return ans;

    }
}