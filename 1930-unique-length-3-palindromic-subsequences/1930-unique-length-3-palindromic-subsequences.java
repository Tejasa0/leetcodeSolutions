class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        int len=s.length();
        
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            hm.put(s.charAt(i),i);
        }
        int arr[]=new int[26];
        int res=0;
        for(int i=len-1;i>=2;i--)
        {
            Set<Character> uniquePal = new HashSet<>();
            char curr=s.charAt(i);
            if(arr[s.charAt(i)-'a']==0 && hm.containsKey(curr))
            {
                for(int j=hm.get(curr)+1;j<i;j++)
                {
                  uniquePal.add(s.charAt(j));  
                }
                arr[s.charAt(i)-'a']=1;
            }
            res+=uniquePal.size();
        }
        return res;
    }

}