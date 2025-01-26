class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(m!=n)
        return false;
        int arr[]=new int[26];
        int arr1[]=new int[26];
        for(int i=0;i<n;i++)
        {
            arr[word1.charAt(i)-'a']++;
            arr1[word2.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++) {
            if ((arr[i]==0 && arr1[i]!=0) || (arr[i]!=0 && arr1[i]==0)) {
                return false;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(arr1);

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr[i]) {
                return false;
            }
        }

        return true;
    }
}