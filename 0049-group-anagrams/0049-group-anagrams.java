class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (String s : strs) {
            int freq[] = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : freq) {
                sb.append(i).append('#');
            }
            hm.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}