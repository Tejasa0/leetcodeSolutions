class Solution {

    public int minZeroArray(int[] nums, int[][] queries) {
        int len=nums.length;
        int[] newArr=new int[len+1];
        int sum=0,ans=0;
        for(int i=0;i<len;i++)
        {
            while(sum+newArr[i]<nums[i])
            {
                ans++;
                if(ans>queries.length)
                return -1;
                int left=queries[ans-1][0];
                int right=queries[ans-1][1];
                int diff=queries[ans-1][2];

                if(right>=i)
                {
                    newArr[Math.max(left,i)]+=diff;
                    newArr[right+1]-=diff;
                }
            }
            sum+=newArr[i];
        }
        return ans;
    }
}