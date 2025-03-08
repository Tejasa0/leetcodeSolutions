class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=Integer.MAX_VALUE;
        int curr=0;
        int white=0;
        int left=0;
        for(char c:blocks.toCharArray())
        {
            if(c=='W')
            white++;
            if(curr-left==k-1)
            {
                ans=Math.min(ans,white);
                if(blocks.charAt(left)=='W')
                white--;
                left++;
            }
            curr++;
        }
        return ans;
    }
}