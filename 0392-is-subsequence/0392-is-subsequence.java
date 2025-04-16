class Solution {
    public boolean isSubsequence(String s, String t) {
        int shortIndex=0;
        int longIndex=0;
        while(shortIndex<s.length() && longIndex<t.length())
        {
            if(s.charAt(shortIndex)==t.charAt(longIndex))
            {
                shortIndex++;
                longIndex++;
            }
            else
            {
                longIndex++;
            }
        }
        if(shortIndex==s.length())
        return true;
        return false;
    }
}