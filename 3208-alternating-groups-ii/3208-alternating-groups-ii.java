class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len=colors.length;
        int newArr[]=new int[len+k-1];
        for(int i=0;i<len;i++)
        {
            newArr[i]=colors[i];
        }
        for(int i=0;i<k-1;i++)
        {
            newArr[len+i]=colors[i];
        }
        len=len+k-1;
        int ans=0;
        int left=0;
        int right=1;
        while(right<len)
        {
            if(newArr[right]==newArr[right-1])
            {
                left=right;
                right++;
            }
            else
            {
                right++;
                if(right-left<k)
                continue;
                ans++;
                left++;
            }
        }
        return ans;
    }
}