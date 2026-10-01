class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (st.size() == 0 || !(st.pop() == '('))
                    return false;
            } else if (ch == '}') {
                if (st.size() == 0 || !(st.pop() == '{'))
                    return false;
            } else if (ch == ']') {
                if (st.size() == 0 || !(st.pop() == '['))
                    return false;
            } else
                st.add(ch);

        }
        if (st.size() == 0)
            return true;
        return false;
    }
}