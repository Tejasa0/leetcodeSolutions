class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        int[] requiredFreq=new int[26]; 
        for(String word:words2)
        {
            int[] currentFreq=new int[26];
            for(char c:word.toCharArray()) {
                currentFreq[c-'a']++;
                requiredFreq[c-'a']=requiredFreq[c-'a']>currentFreq[c-'a']?requiredFreq[c-'a']:currentFreq[c-'a'];
            }
        }
        for(String word:words1)
        {
            int[] wordFreq=new int[26];
            for(char c:word.toCharArray())
            {
                wordFreq[c-'a']++;
            }
            boolean isValid=true;
            for(int i=0;i<26;i++)
            {
                if(wordFreq[i]<requiredFreq[i])
                {
                    isValid=false;
                    break;
                }
            }
            
            if (isValid)
            {
                ans.add(word);
            }
        }
        return ans;
    }
}