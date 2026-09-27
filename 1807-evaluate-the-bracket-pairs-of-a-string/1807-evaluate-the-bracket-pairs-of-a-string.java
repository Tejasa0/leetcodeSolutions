class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> mp = new HashMap<>();
        for (List<String> li : knowledge) {
            mp.put(li.get(0), li.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                i++;
                StringBuilder sb = new StringBuilder();
                while (s.charAt(i) != ')') {
                    sb.append(s.charAt(i++));
                }
                String key = sb.toString();
                if (mp.containsKey(key))
                    ans.append(mp.get(key));
                else
                    ans.append('?');
            } else
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}