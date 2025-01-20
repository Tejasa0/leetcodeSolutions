class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if(n%2==1)
        return false;
        int openCount=0;
        int closeCount=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || locked.charAt(i)=='0')
            openCount++;
            else
            openCount--;
            if(openCount<0)
            return false;
            if(s.charAt(n-1-i)=='(' || locked.charAt(n-1-i)=='0')
            closeCount++;
            else
            closeCount--;
            if(closeCount<0)
            return false;
        }
        return true;
    }
}