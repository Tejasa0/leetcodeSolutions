class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (String s : strs) {
            int freq[] = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(("a"+freq[i])+(freq[i] + ""));
            }
            if (hm.containsKey(sb.toString())) {
                ArrayList<String> curr = hm.get(sb.toString());
                curr.add(s);
                hm.put(sb.toString(), curr);
            } else {
                ArrayList<String> curr = new ArrayList<>();
                curr.add(s);
                hm.put(sb.toString(), curr);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (ArrayList<String> ls : hm.values()) {
            ans.add(ls);
        }
      //  Collections.sort(ans);
        return ans;
    }
}