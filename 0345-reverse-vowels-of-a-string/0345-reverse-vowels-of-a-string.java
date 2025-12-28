class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char arr[] = s.toCharArray();
        while (i < j) {
            if (!isVowel(arr[i]))
                i++;
            if (!isVowel(arr[j]))
                j--;
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                char tmp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr)
            sb.append(c);
        return sb.toString();
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U')
            return true;
        return false;
    }
}