class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int max=0;
        int count=0;
        while(j<k)
        {
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
            {
                count++;
            }
            j++;
        }
        max=count;
        while(j<s.length())
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            count--;
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
            count++;
            if(count>max)
            max=count;
            i++;
            j++;
        }
        return max;
    }
}