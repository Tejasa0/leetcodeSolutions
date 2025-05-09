class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int count=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int pointer=0;
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                if(count>res)
                {
                    res=count;
                }
                count=1;
                pointer++;
                i=pointer;
                hm.clear();
                hm.put(s.charAt(i),1);
                continue;
            }
            else
            {
                count++;
                hm.put(s.charAt(i),1);
            }
        }
        if(count>res)
        res=count;
        return res;
        
    }
}