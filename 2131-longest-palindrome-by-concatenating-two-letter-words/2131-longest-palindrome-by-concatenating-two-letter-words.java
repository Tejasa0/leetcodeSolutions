class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> hm = new HashMap<>();
        for (String w : words) {
            hm.put(w, hm.getOrDefault(w, 0) + 1);
        }
        int ans = 0;
        boolean flag = false;
        for (String curr : hm.keySet()) {
            int count = hm.get(curr);
            if (count == 0)
                continue;
            String rev = new StringBuilder(curr).reverse().toString();
            if (rev.equals(curr)) {
                ans += (count / 2) * 4;
                if (flag == false && count % 2 == 1) {
                    flag = true;
                    ans += 2;
                }
            } else if (hm.containsKey(rev)) {
                count = Math.min(count, hm.get(rev));
                ans += count * 4;
                hm.put(rev, 0);
            }
        }
        return ans;
    }
}