class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                stack.push(currStr.toString());
                stack.push(String.valueOf(num));
                currStr = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int repeatCount = Integer.parseInt(stack.pop());
                String prevStr = stack.pop();
                StringBuilder temp = new StringBuilder(prevStr);
                for (int i = 0; i < repeatCount; i++) {
                    temp.append(currStr);
                }
                currStr = temp;
            } else {
                currStr.append(c);
            }
            System.out.println(stack);
        }

        return currStr.toString();
    }
}
