class Solution {
    public int maxScore(String s) {
        int zero=0;
        int one=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                if(s.charAt(i)=='0')
                zero++;
                continue;
            }

            if(s.charAt(i)=='1')
            one++;
        }
        int total=zero+one;
        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                zero++;
            }
            else
            one--;
            if(one+zero>total)
            total=one+zero;
        }
        return total;
    }
}