class Solution {
    public int[] searchRange(int[] nums, int target) {
        int flag=0;
        int st=-1;
        int en=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(flag==0)
                {
                    flag=1;
                    st=i;
                }else
                en=i;
            }
        }
        if(en==-1 && st!=-1)
        en=st;
        return new int[]{st,en};
    }
}