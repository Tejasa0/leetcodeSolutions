class Solution {

    public String robotWithString(String s) {
        StringBuilder ans = new StringBuilder();
        int freq[] = new int[26];
        for (char curr : s.toCharArray()) {
            freq[curr - 'a']++;
        }
        Stack<Character> stk = new Stack<>();
        char min = 'a';
        for (char curr : s.toCharArray()) {
            stk.push(curr);
            freq[curr - 'a']--;
            while (min != 'z' && freq[min - 'a'] == 0) {
                min++;
            }
            while (!stk.isEmpty() && stk.peek() <= min) {
                ans.append(stk.pop());
            }
        }
        return ans.toString();
    }
}