class Solution {
    public int maximumCount(int[] nums) {
        int negCount=0;
        int zeroCount=0;
        for(int i:nums)
        {
            if(i>0)
            break;
            if(i==0)
            zeroCount++;
            else
            negCount++;
        }
        return Math.max(negCount,nums.length-negCount-zeroCount);
    }
}