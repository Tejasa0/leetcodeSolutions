class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c))
                list.add(c);
        }
        Collections.sort(list);
        System.out.println(list);
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c))
                sb.append(list.get(index++));
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    }
}