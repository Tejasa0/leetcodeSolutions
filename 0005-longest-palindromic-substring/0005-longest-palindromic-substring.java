class Solution {
    public boolean isPal(String s1)
    {
        for(int i=0;i<(s1.length()/2)+1;i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
            return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len=1;
        String res=""+s.charAt(0);
        for(int i=0;i<s.length()-1;i++)
        {
            String pal=""+s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                pal=pal+s.charAt(j);
                if(j-i+1>len && isPal(pal))
                {

                        res=pal;
                        len=pal.length();
                    
                    
                }
            }
        }
        return res;
    }
}