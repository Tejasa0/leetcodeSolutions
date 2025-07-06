class Solution {
    public int compress(char[] chars) {
        int j = 0;
        int count = 1;
        int i = 0;
        for (i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[j++] = chars[i];
                if (count > 9) {
                    String s = Integer.toString(count);
                    for (char c : s.toCharArray()) {
                        chars[j++] = c;
                    }
                } else if (count > 1) {
                    chars[j++] = (char) (count + '0');
                }
                count = 1;
            }

        }
        chars[j++] = chars[i];
        if (count > 9) {
            String s = Integer.toString(count);
            for (char c : s.toCharArray()) {
                chars[j++] = c;
            }
        } else if (count > 1) {
            chars[j++] = (char) (count + '0');
        }
        return j;
    }
}