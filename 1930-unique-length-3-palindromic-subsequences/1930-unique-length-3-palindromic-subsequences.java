class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        int len=s.length();
        Set<String> uniquePal = new HashSet<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            char curr=s.charAt(i);
            if(hm.containsKey(curr))
            {
                for(int j=hm.get(curr)+1;j<i;j++)
                {
                  uniquePal.add(""+curr+s.charAt(j)+curr);  
                }
            }
            else
            hm.put(curr,i);
            if(uniquePal.size()==676)
            break;
        }
        return uniquePal.size();
    }

}