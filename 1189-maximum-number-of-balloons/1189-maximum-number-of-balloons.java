class Solution {
    public int maxNumberOfBalloons(String text) {
        int min = Integer.MAX_VALUE;
        int arr[] = new int[26];
        for (char c : text.toCharArray()) {
            arr[c - 'a']++;
        }
        min = Math.min(arr[1], min);
        min = Math.min(arr[0], min);
        min = Math.min(arr[14] / 2, min);
        min = Math.min(arr[11] / 2, min);
        min = Math.min(arr[13], min);
        return min;
    }
}