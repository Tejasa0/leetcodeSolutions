class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int l=s1.length();
        if(l!=s2.length())
        return false;
        int arr[]=new int[26];
        for(int i=0;i<l;i++)
        arr[s1.charAt(i)-'a']++;
        for(int i=0;i<l;i++)
        {
            if(arr[s2.charAt(i)-'a']--==0)
            return false;
            //arr[s2.char]
            if(s1.charAt(i)!=s2.charAt(i))
            count++;
            if(count>2)
            return false;
        }
        if(count==1)
        return false;
        return true;
    }
}