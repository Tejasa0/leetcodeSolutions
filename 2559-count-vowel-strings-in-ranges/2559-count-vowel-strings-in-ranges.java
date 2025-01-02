class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int l=queries.length;
        int len=words.length;
        int ans[]=new int[len];
        int res[]=new int[l];
        for(int i=0;i<len;i++)
        {
            if(checkVowel(words[i]))
            {
                if(i==0)
                {
                    ans[i]=1;
                    continue;
                }
                ans[i]+=1;
            }
            if(i!=0)
            ans[i]+=ans[i-1];
        }
        for(int i=0;i<l;i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            if(left==0)
            res[i]=ans[right];
            else
            res[i]=ans[right]-ans[left-1];
        }
        return res;
    }
    public boolean checkVowel(String s)
    {
        int size=s.length()-1;
        if((s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u')  && (s.charAt(size)=='a' || s.charAt(size)=='e' || s.charAt(size)=='i' || s.charAt(size)=='o' || s.charAt(size)=='u'))
        return true;
        return false;
    }
}