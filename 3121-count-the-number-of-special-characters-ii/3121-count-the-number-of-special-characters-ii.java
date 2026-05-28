class Solution {
    public int numberOfSpecialChars(String word) {
        int [] count=new int[26];
        int [] count1=new int[26];
        for(char c : word.toCharArray()){
            int s = c - 'a';
            int b = c - 'A';
            if(s>-1 && s<26){
                if(count1[s]!=0){
                    count1[s]=-1;
                    continue;
                }
                count[s]++;
            }
            if(b>-1 && b<26){
                if(count[b]!=0 && count1[b]!=-1)
                count1[b]++;
                else
                count1[b]=-1;
            }
        }
        int ans=0;
        for(int i=0;i<26;i++){
            System.out.println(count1[i]);
            if(count[i]>0 && count1[i]>0){
                ans++;
            }
        }
        return ans;
        
    }
}