class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<=n-k;i=i+k)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=(s.charAt(j)-'a');
            }
            res.append(((char)(sum%26+'a')));
        }
        return res.toString();
    }
}