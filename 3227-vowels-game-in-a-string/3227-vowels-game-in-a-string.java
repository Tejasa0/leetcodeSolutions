class Solution {
    public boolean doesAliceWin(String s) {
        boolean hasVowel = false;
        int l = 0;

        while (l < s.length()) {
            int r = l;

            while (r < s.length()) {
                if (isVowel(s.charAt(r))) {
                    hasVowel = true;
                    break;
                }
                r++;
            }

            l = r + 1;
        }

        return hasVowel;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
