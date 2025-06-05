class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character, Set<Character>> nodes = new HashMap<>();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            nodes.computeIfAbsent(ch1, k -> new HashSet<>()).add(ch2);
            nodes.computeIfAbsent(ch2, k -> new HashSet<>()).add(ch1);
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            ans.append(dfs(nodes, ch, new boolean[26]));
        }
        return ans.toString();
    }

    private char dfs(Map<Character, Set<Character>> nodes, char curr, boolean visited[]) {
        char min = curr;
        visited[curr - 'a'] = true;
        for (char adj : nodes.getOrDefault(curr, new HashSet<>())) {
            if (!visited[adj - 'a']) {
                char latest = dfs(nodes, adj, visited);
                if (latest < min)
                    min = latest;
            }
        }
        return min;
    }
}