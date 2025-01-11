class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(n<k)
        return false;
        int arr[]=new int[26];
        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int oddCounts=0;
        for(int i:arr)
        {
            if(i%2!=0)
            {
                oddCounts++;
            }
            if(oddCounts>k)
            return false;
        }
        return true;
    }
}