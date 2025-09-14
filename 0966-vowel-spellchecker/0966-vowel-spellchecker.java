class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> actualWords = new HashSet<>();
        Map<String, String> lowerCases = new HashMap<>();
        Map<String, String> vowel = new HashMap<>();
        for (String s : wordlist) {
            actualWords.add(s);
            String lower = s.toLowerCase();
            lowerCases.putIfAbsent(lower, s);
            vowel.putIfAbsent(possibleVowel(lower), s);
        }
        String[] ans = new String[queries.length];
        int count = 0;
        for (String s : queries) {

            if (actualWords.contains(s)) {
                ans[count++] = s;
                continue;
            }
            String lower = s.toLowerCase();
            if (lowerCases.containsKey(lower)) {
                ans[count++] = lowerCases.get(lower);
                continue;
            }
            String vowelCase = possibleVowel(lower);
            if (vowel.containsKey(vowelCase)) {
                ans[count++] = vowel.get(vowelCase);
                continue;
            }
            ans[count++] = "";
        }
        return ans;
    }

    public String possibleVowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c))
                sb.append("-");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}