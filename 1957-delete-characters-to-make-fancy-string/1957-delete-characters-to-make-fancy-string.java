class Solution {
    public String makeFancyString(String s) {
        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(start)) {
                if ((i - start) >= 2) {
                    continue;
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                start = i;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}